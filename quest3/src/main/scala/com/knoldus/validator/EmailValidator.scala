package com.knoldus.validator

import java.util.regex.{Matcher, Pattern}

class EmailValidator {

  def emailIdIsValid(emailId: String): Boolean =
  {
    val ePattern: String = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"
    val p: Pattern = java.util.regex.Pattern.compile (ePattern)
    val m: Matcher = p.matcher (emailId)
    return m.matches
  }
}
