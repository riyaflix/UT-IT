import org.scalatest.flatspec.AnyFlatSpec

class DivideTest extends AnyFlatSpec {

  it should "match" in {
assert(Divide.divide(10,2) == 5)
}

  it should "match2" in {
  assert(Divide.divide(40,10) == 4)
  }

  it should "match3" in {
    assert(Divide.divide(0,10) == 0)
  }
}
