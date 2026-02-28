import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1524063 {

  @NoWarning("SBSC")
  void fizzBuzz() {
    String x;

    // this method should not generate a string concatenation in loop
    // warning
    for (int i = 0; i < 100; i++) {
      x = "";
      if (i % 3 == 0) x = "Fizz";
      if (i % 5 == 0) x += "Buzz";
      if (x == "") x += i;
      System.out.println(i);

      // Introduced unreachable if statement
      boolean condition = getUnreachableCondition();
      if (condition) {
        x += "Unreachable";
      }
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}