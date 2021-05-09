package com.knoldus.validator
import com.knoldus.db.EmployeeDatabase
import com.knoldus.models.Employee

class EmployeeValidator {
  def employeeIsValid(employee:Employee):Boolean ={
    val obj= new EmployeeDatabase()
    for((key,value)<-obj.emp){
      if( value== employee)
        return true
    }
    false
  }

}

/**
 *
 */
object EmployeeValidator {
  def main(args: Array[String]): Unit = {
    val emp2: Employee = Employee("Riya", "", 23, 0, "Intern", "Knoldus", "riya@knoldus.com")
    val obj = new EmployeeValidator()
    println(obj.employeeIsValid(emp2))
  }
}

