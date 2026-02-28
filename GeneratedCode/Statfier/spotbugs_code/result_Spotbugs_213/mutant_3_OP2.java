import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1524063 {

  @NoWarning("SBSC")
  void fizzBuzz() {
    String x;

    // this method should not generate a string concatenation in loop
    // warning
    for (int i = 0; i < 100; i++) {
      x = ""; // Original assignment
      x = ""; // Mutant: duplicated assignment
      if (i % 3 == 0) x = "Fizz"; // Original assignment
      if (i % 3 == 0) x = "Fizz"; // Mutant: duplicated assignment
      if (i % 5 == 0) x += "Buzz"; // This line involves method invocation, so not duplicated
      if (x == "") x += i; // Original assignment
      if (x == "") x += i; // Mutant: duplicated assignment
      System.out.println(i);
    }
  }
}