package com.example.gamelistpibien.ui.login;

import com.example.gamelistpibien.model.User;

import java.util.ArrayList;
import java.util.List;

public class LoginPresenter implements LoginContract.Presenter{

    LoginContract.View view;
    LoginContract.Presenter presenter;

    public LoginPresenter(LoginContract.View view, LoginContract.Presenter presenter) {
        this.view = view;
        this.presenter = presenter;
    }


    @Override
    public void login(User user) {

        List<User> userList = new ArrayList<>();

        for (User user1 : userList) {
            if (user.equals(user1)) {
                if (user.getPassword().equals(user1.getPassword())) {
                    //Acción de login
                    presenter.loginSuccess();
                }
            }
        }
        presenter.emailOrPasswordError();
    }

    @Override
    public void emailOrPasswordError() {
        view.emailOrPasswordError();
    }

    @Override
    public void loginSuccess() {
        view.loginSuccess();
    }
}
