package com.knoldus.validator
import org.scalatest.flatspec.AnyFlatSpec


class PasswordValidatorTest extends AnyFlatSpec{

  //Test case for Password valid or not

  " A password " should "not valid because it's not caintain any number" in
  {
    val psswrd = new PasswordValidator()
    val pw = psswrd.isValidPassword("Sonu@")
    assert( !pw)
  }

  it should("not valid password because it is not cointains any special Chrarcter") in
    {
      val psswrd = new PasswordValidator()
      val valid = psswrd.isValidPassword("Sonu1234")
      assert( !valid)
    }
  it should("Valid Password because iit is fullfilled all condition")  in
  {
    val psswrd = new PasswordValidator()
    val valid = psswrd.isValidPassword("Sonu1234*")
    assert( valid)
  }
}
