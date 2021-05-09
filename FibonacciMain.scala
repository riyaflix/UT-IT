import Fibonacci.fibonacci

object FibonacciMain {
  def main(args: Array[String]) {
    for {i <- List.range(1, 20)}
      yield {
        print(fibonacci(i) + ", ")
      }
    println("...")
  }
}
