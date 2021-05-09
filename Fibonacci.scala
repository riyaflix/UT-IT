object Fibonacci {
    def fibonacci(n: Int): Int =
      if (n < 3) 1
      else fibonacci(n - 1) + fibonacci(n - 2)
}
