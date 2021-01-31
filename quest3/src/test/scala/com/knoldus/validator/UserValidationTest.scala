package com.knoldus.validator
import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.models.User
class UserValidationTest extends AnyFlatSpec {
  val userValidator: UserValidator = new UserValidator()
  behavior of "this user"

  it should "be valid as its company exist in database and the email id is also valid" in {
    val newUser: User = User("Sonu","Kumar","Knoldus","sonuraj1926@gmail.com")
    assert(userValidator.userIsValid(newUser))
  }

  it should "not be valid as its company exist in database and the emailid is the also not valid" in
  {
    val newUser = User("Varun","Singh","Accenture","varunsinghhgmail.com")
    assert(!userValidator.userIsValid(newUser))
  }

}