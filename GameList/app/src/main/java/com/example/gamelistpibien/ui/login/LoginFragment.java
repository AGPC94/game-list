package com.example.gamelistpibien.ui.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.gamelistpibien.R;
import com.example.gamelistpibien.ui.GameFragment;

public class LoginFragment extends Fragment implements LoginContract.View {
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login, container, false);
        return view;
        /*
        Button btnRegister = view.findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment);
            }
        }));

         */


    }

    @Override
    public void emailOrPasswordError() {
        Toast.makeText(getContext(), "Email o contraseña incorrecta", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {


                /* Configure Google Sign In
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        GoogleSignInClient mGoogleSignInClient = GoogleSignIn.getClient(getActivity(), gso);
         */
    }
}