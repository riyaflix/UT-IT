import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {

  it should "match" in {
    assert(EmailValidator.isValid("riya@knoldus.com") == true)
  }
  it should "match2" in {
    assert(EmailValidator.isValid("riya123@gmail.com") == true)
  }
  it should "match3" in {
    assert(EmailValidator.isValid("riyagmailcom") == false)
  }
  it should "match4" in {
    assert(EmailValidator.isValid("riya#gmail.com") == false)
  }
  it should "match5" in {
    assert(EmailValidator.isValid("riya.for.real@gmail.com") == true)
  }
}
