package com.knoldus.validator
import org.scalatest.flatspec.AnyFlatSpec
class EmailValidatorTest extends AnyFlatSpec {

  "An email " should "be Valid " in
  {
    val emailvalidator = new EmailValidator()
    val result = emailvalidator.emailIdIsValid("Sonuraj2936@gmail.com")
    assert(result)
  }
  it should "be not valid " in
  {
    val emailvalidator = new EmailValidator()

    val result = emailvalidator.emailIdIsValid("Sonuraj@2936@gmail.com")

    assert(!result)
  }
}
