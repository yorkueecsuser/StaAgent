import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1524063 {

  @NoWarning("SBSC")
  void fizzBuzz() {
    String x;

    // this method should not generate a string concatenation in loop
    // warning
    for (int i = 0; i < 100; i++) {
      x = ""; // Original assignment
      x = ""; // Mutant assignment
      if (i % 3 == 0) x = "Fizz"; // Original assignment
      if (i % 3 == 0) x = "Fizz"; // Mutant assignment
      if (i % 5 == 0) x += "Buzz"; // This uses method invocation, so no mutation here
      if (x == "") x += i; // Original assignment
      if (x == "") x += i; // Mutant assignment
      System.out.println(i);
    }
  }
}