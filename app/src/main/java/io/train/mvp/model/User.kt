package io.train.mvp.model

import android.text.TextUtils
import android.util.Patterns

class User(private val email: String, private val password: String): IUser {

    override fun getEmail(): String {
        return email
    }

    override fun getPassword(): String {
        return password
    }

    override fun isValidData(): Int {
        return when {
            TextUtils.isEmpty(getEmail()) -> 0
            Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() -> 1
            getPassword().length < 6 -> 2
            else -> -1
        }
    }

}