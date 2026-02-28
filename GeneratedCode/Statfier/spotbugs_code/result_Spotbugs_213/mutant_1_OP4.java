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

      // Inserting unreachable if-else branch
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This block is intended to be unreachable
        x = "Unreachable";
      } else {
        // This block will always execute
        x = "Reachable";
      }
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}