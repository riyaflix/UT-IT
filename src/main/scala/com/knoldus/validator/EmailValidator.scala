package com.knoldus.validator
import com.knoldus.db.CompanyReadDto

class EmailValidator {
  // checking if the format of email is valid or not
  def isValid(email: String): Boolean = {
    if ("""([a-z\d\.-]+)@([a-z\d-]+)\.([a-z]{2,8})(\.[a-z]{2,8})?""".r.findFirstIn(email) == None) false
    else true
  }
  // checking if the email also exists in our database or not

  def existInDb(emailId: String): Boolean = {
    val cmp= new CompanyReadDto()
    for((key,value)<-cmp.companies){
      if( value.emailId == emailId ) true
    }
    false
  }
}
object EmailValidator{
  def main(args:Array[String]):Unit={
    val obj = new EmailValidator()
    println(obj.isValid("riya@knoldus.com"))
    println(obj.existInDb("riya@knoldus.com"))


  }
}
