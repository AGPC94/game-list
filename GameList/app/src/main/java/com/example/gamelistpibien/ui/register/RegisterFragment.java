package com.example.gamelistpibien.ui.register;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.example.gamelistpibien.R;
import com.example.gamelistpibien.databinding.FragmentRegisterBinding;
import com.example.gamelistpibien.model.User;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterFragment extends Fragment implements RegisterContract.View {

    FragmentRegisterBinding binding;
    RegisterContract.Presenter presenter;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        presenter = new RegisterPresenter(this, presenter);

        binding = FragmentRegisterBinding.inflate(inflater, container, false);

        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User("", binding.etEmailReg.getText().toString(), binding.etPasswordReg.getText().toString());
                presenter.register(user, binding.etConfirmPasswordReg.getText().toString());
            }
        });

        return binding.getRoot();

    }

    @Override
    public void emailFormatError() {
        binding.etEmailReg.setError("Formato de email incorrecto");
    }

    @Override
    public void emailExistsError() {
        binding.etEmailReg.setError("Ya existe un usuario con el mismo email");
    }

    @Override
    public void passworConfirmError() {
        binding.etConfirmPasswordReg.setError("Las contraseñas no coinciden");
    }

    @Override
    public void registerSuccess() {
        Toast.makeText(getContext(), "¡Te has registrado!", Toast.LENGTH_SHORT).show();
        Navigation.findNavController(getView()).navigate(R.id.action_registerFragment_to_loginFragment);
    }
}