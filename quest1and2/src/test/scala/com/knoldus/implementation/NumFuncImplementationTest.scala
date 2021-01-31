package com.knoldus.implementation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
class NumFuncImplementationTest extends AnyFlatSpec {

  val forPlaindromeValidation = new NumFuncImplementation()
  val forFactorialNumber = new NumFuncImplementation()

  //Test Case to validate Plaindrome
  "A number " should " not be plaindrome" in {
    assert(!forPlaindromeValidation.is_Palindrome(2122))
  }
  it should "be a plaindrome" in {
    assert(forPlaindromeValidation.is_Palindrome(0x0))
  }
  //TestCase to validate the factorial
  "A number 5 " should "return 120 as a factorial of 5" in
  {
    assert(forFactorialNumber.factorial(5)==120)
  }
  it should "return 3 as a factorial of 3 is 6" in
  {
    assert(forFactorialNumber.factorial(0)==1)
  }
}
