import com.knoldus.validator.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {

  "Email ID" should "match" in {
    val obj = new EmailValidator()
    assert(obj.isValid("riya@knoldus.com") == true)
    assert(obj.isValid("riya123@gmail.com") == true)
    assert(obj.isValid("riyagmailcom") == false)
    assert(obj.isValid("riya#gmail.com") == false)
    assert(obj.isValid("riya.for.real@gmail.com") == true)
    assert(obj.existInDb("riya@knoldus.com") == false)
    assert(obj.existInDb("abc@knoldus.com") == false)
  }
}
