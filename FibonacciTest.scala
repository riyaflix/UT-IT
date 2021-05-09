import org.scalatest.flatspec.AnyFlatSpec

class FibonacciTest extends AnyFlatSpec {

  it should "match" in {
    assert(Fibonacci.fibonacci(9) == 34)
  }
it should "match2" in {
  assert(Fibonacci.fibonacci(0) == 1)
}

}
