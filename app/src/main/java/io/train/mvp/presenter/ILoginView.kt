package io.train.mvp.presenter

interface ILoginView {
    fun onLoginSuccess(message: String)
    fun onLoginError(message: String)
}