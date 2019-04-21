package io.train.mvp.model

interface IUser {

    fun getEmail(): String
    fun getPassword(): String
    fun isValidData(): Int
}