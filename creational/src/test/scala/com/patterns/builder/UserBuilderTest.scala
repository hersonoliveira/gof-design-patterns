import com.patterns.builder.UserBuilder
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class UserBuilderTest extends AnyFlatSpec with Matchers {

  "UserBuilder" should "return a User()" in {
    val user = new UserBuilder()
      .setFirstName("Frodo")
      .setAddress("Vila utca 1")
      .build

    user.firstName should be ("Frodo")
    user.lastName should be ("")
    user.age should be (0)
  }
}
