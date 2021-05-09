object EmailValidator {

  def isValid(email: String): Boolean = {
    if ("""([a-z\d\.-]+)@([a-z\d-]+)\.([a-z]{2,8})(\.[a-z]{2,8})?""".r.findFirstIn(email) == None) false
    else true
  }
}