package com.knoldus.request
import org.scalatest.flatspec.AnyFlatSpec
import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.mockito.MockitoSugar.{when, mock}

class CompanyImplTest extends AnyFlatSpec {

  //unit Test Cases
  "A CompanyImpl" should "create company because not exist in db" in{
    val testCompany: Company = Company("Dell","dell@gmail.com","Pune")
    val mockCompanyValidator = mock[CompanyValidator]
    when(mockCompanyValidator.companyIsValid(testCompany)) thenReturn(true)
    val companyImplTest = new CompanyImpl(mockCompanyValidator)
    val result = companyImplTest.createCompany(testCompany)
    assert(result==Option(testCompany.name))
  }
  "it" should "not create company because exist in db" in{
    val testCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    val mockCompanyValidator = mock[CompanyValidator]
    when(mockCompanyValidator.companyIsValid(testCompany)) thenReturn(true)
    val companyImplTest = new CompanyImpl(mockCompanyValidator)
    val result = companyImplTest.createCompany(testCompany)
    assert(result == Option(testCompany.name))
  }

}

