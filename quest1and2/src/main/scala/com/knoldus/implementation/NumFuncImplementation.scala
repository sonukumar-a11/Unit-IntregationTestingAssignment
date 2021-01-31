package com.knoldus.implementation
import com.knoldus.traits.palindromeAndFactorial

class NumFuncImplementation extends palindromeAndFactorial {
  //chack given number is plaindrome
  override def is_Palindrome(nums: Int):Boolean = {
    //firstly finding the last digit to compare
    var divisor = 1
    var num = nums
    while (nums / divisor >= 1) {
      divisor = divisor * 10
    }
    while (num != 0) {
      val last = num / divisor
      val travel = num % 10
      if (last != travel) {
        return false
      }
      num = (num % divisor)/10
      divisor = divisor/100
    }
    true
  }
  override def factorial(num: Int): Int = {
    if (num == 0)
      return 1
    num * factorial(num - 1)
  }
}