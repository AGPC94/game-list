package com.example.gamelistpibien.ui.register;

import com.example.gamelistpibien.model.User;

public interface RegisterContract {

    interface View {
        void emailFormatError();
        void emailExistsError();
        void passworConfirmError();
        void registerSuccess();
    }

    interface Presenter extends View{
        void register(User user, String confirmPassword);

        @Override
        void emailFormatError();

        @Override
        void emailExistsError();

        @Override
        void passworConfirmError();

        @Override
        void registerSuccess();
    }
}
