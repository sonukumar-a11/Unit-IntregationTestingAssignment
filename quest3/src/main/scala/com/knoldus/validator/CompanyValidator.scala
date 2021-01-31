package com.knoldus.validator
import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator {

  def companyIsValid(company: Company): Boolean =
  {
    //company name is exist or not
    val companyResult = new CompanyReadDto()
    val dbResult: Option[Company] = companyResult.getCompanyByName(company.name)
    //emailValidation
    val emailValid = new EmailValidator()

    val emailValidResult = emailValid.emailIdIsValid(company.emailId)

    if(emailValidResult && dbResult.isDefined)
      return true
    false
  }

}
