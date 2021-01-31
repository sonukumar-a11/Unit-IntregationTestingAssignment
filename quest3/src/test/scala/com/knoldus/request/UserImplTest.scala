package com.knoldus.request
import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.scalatest.flatspec.AnyFlatSpec
import org.mockito.MockitoSugar.{when,mock}
class UserImplTest extends AnyFlatSpec {
    //unit test for user

    "A UserImpl" should "create User because not exist in db" in{

      val newUser = User("Sonu","Kumar","Knoldus","sonuraj1926@gmail.com")
      val mockuserValidator = mock[UserValidator]
      when(mockuserValidator.userIsValid((newUser))) thenReturn(true)

      val userImpl = new UserImpl(mockuserValidator)
      var result = userImpl.createUser(newUser)

      assert(result==Option(newUser.emailId))
    }
  it should "not create User because emaild is not valid" in{

    val newUser = User("Varun ","Singh","varunsinghgmail.com","knoldus")
    val mockuserValidator = mock[UserValidator]
    when(mockuserValidator.userIsValid((newUser))) thenReturn(false)

    val userImpl = new UserImpl(mockuserValidator)
    var result = userImpl.createUser(newUser)

    assert(result == None)
  }
}
