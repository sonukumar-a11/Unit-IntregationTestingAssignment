package com.knoldus.validator

class PasswordValidator {

  def isValidPassword(password: String): Boolean = {

    val pattern = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"
    if (password.length < 8)
      false
    else if (!password.matches(pattern))
      false

    else
      true
  }
}