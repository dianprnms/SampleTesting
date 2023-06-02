package com.example.sampletesting

class Register {
    private val existingUsers = listOf("Behroz", "Bahram", "Parmida", "Raika")
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty() || confirmedPassword.isEmpty()){
            return false
        }
        if (username in existingUsers){
            return false
        }
        if (password != confirmedPassword){
            return false
        }
        if (password.count { it.isDigit() } < 8){
            return false
        }
        return true
    }
}