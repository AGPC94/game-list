package com.example.gamelistpibien.ui.login;

import com.example.gamelistpibien.model.User;

public interface LoginContract {

    interface View {
        void emailOrPasswordError();
        void loginSuccess();
    }

    interface Presenter extends View {

        void login(User user);

        @Override
        void emailOrPasswordError();

        @Override
        void loginSuccess();
    }
}
