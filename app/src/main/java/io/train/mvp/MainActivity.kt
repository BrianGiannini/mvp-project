package io.train.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.dmoral.toasty.Toasty
import io.train.mvp.presenter.ILoginPresenter
import io.train.mvp.presenter.ILoginView
import io.train.mvp.presenter.LoginPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ILoginView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginPresenter: ILoginPresenter = LoginPresenter(this)

        loginButton.setOnClickListener {
            loginPresenter.onLogin(inputEmail.text.toString(), inputPassword.text.toString())
        }
    }

    override fun onLoginSuccess(message: String) {
        Toasty.success(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onLoginError(message: String) {
        Toasty.error(this, message, Toast.LENGTH_SHORT).show()
    }

}
