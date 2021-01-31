package com.knoldus.validator
import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.models.Company

class CompanyValidatorTest extends AnyFlatSpec {
  "A Company " should "not valid this cantains valid company" in
    {
      val companyValidator = new CompanyValidator()
      val userInputCompany: Company = Company("Asus",
        "asus@asus.com", "Noida")
      val result = companyValidator.companyIsValid(userInputCompany)
      assert(!result)
    }

  it should "valid because it is caintains valid company" in
    {
      val companyValidator = new CompanyValidator()
      val userInputCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
      val result = companyValidator.companyIsValid(userInputCompany)
      assert(result)
    }

}
