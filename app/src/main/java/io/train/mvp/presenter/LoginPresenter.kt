package io.train.mvp.presenter

import io.train.mvp.model.User

class LoginPresenter(private val loginView: ILoginView): ILoginPresenter {


    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        val loginCode = user.isValidData()

        when (loginCode) {
            0 -> loginView.onLoginError("You must enter an email")
            1 -> loginView.onLoginError("You must enter a valid email")
            2 -> loginView.onLoginError("Password length must be grater than 6")
            else -> loginView.onLoginSuccess("Login Success")
        }
    }
}