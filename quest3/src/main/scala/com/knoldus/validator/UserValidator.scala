package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.{Company, User}


class UserValidator {
  def userIsValid(user: User): Boolean= {
    val database: CompanyReadDto = new CompanyReadDto()

    val dbResult: Option[Company] = database.getCompanyByName(user.company)

    //email should be valid
    val emailDatabase: EmailValidator = new EmailValidator()
    val emailResult = emailDatabase.emailIdIsValid(user.emailId)

    if (dbResult.isDefined && emailResult)  true

    else false
  }
}
