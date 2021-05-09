package com.knoldus.db
import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class EmployeeDatabase{

  val emp1: Employee= Employee("Riya","",23,0,"Intern","Knoldus","riya@knoldus.com")
  val emp2: Employee= Employee("Unknown","",25,0,"Intern","Knoldus","unknown@knoldus.com")
  val emp: HashMap[String, Employee] = HashMap("emp1" -> emp1, "emp2" -> emp2)

}