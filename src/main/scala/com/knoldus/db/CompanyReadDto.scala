package com.knoldus.db

import com.knoldus.models.Company

import scala.collection.immutable.HashMap

class CompanyReadDto {

  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val philipsCompany: Company = Company("Philips", "philips@gmail.com", "Noida")
  val companies: HashMap[String, Company] = HashMap("Knoldus" -> knoldusCompany, "Philips" -> philipsCompany)

  def getCompanyByName(name: String): Option[Company] = companies.get(name)

}
