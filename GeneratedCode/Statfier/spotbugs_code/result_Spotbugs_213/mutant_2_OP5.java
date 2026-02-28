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

      // Inserting an unreachable switch statement
      boolean condition = getUnreachableCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be reached because condition is always false
          x = "Unreachable";
          break;
        case 1:
          // This case will always be reached
          x = "Reachable";
          break;
      }
    }
  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}