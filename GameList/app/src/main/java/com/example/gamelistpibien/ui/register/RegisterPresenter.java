package com.example.gamelistpibien.ui.register;

import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;

import com.example.gamelistpibien.R;
import com.example.gamelistpibien.model.User;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterPresenter implements RegisterContract.Presenter {

    RegisterContract.View view;
    RegisterContract.Presenter presenter;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    public RegisterPresenter(RegisterContract.View view, RegisterContract.Presenter presenter) {
        this.view = view;
        this.presenter = presenter;
    }

    @Override
    public void register(User user, String confirmPassword) {

        List<User> userList = new ArrayList<User>();

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        /*Listar usuarios
        databaseReference.child("User").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                //Limpiamos lista para evitar acumular datos
                userList.clear();

                //Recorremos usuarios de la base de datos y los pasamos a la lista
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                    User u = dataSnapshot.getValue(User.class);
                    userList.add(u);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        */

        //Patrón de email correcto
        Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(user.getEmail());

        if (!matcher.find()) {
            presenter.emailFormatError();
            return;
        }

        //Email no repetido
        for (User user1 : userList) {
            if (user.equals(user1)) {
                presenter.emailExistsError();
                return;
            }
        }

        //Confirmar contraseña
        if (user.getPassword().equals(confirmPassword)) {
            presenter.passworConfirmError();
            return;
        }

        //Registra usuario
        //Nombre de la tabla, su clave y el objeto
        //databaseReference.child("User").child(user.getEmail()).setValue(user);
        presenter.registerSuccess();
    }

    @Override
    public void emailFormatError() {
        view.emailFormatError();
    }

    @Override
    public void emailExistsError() {
        view.emailExistsError();
    }

    @Override
    public void passworConfirmError() {
        view.passworConfirmError();
    }

    @Override
    public void registerSuccess() {
        view.registerSuccess();
    }
}
