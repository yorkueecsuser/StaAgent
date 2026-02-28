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

      // Inserting an unreachable for loop
      boolean conditionFor = getUnreachableCondition();
      for (int j = 0; conditionFor; j++) {
        // This loop is unreachable because conditionFor is always false
        System.out.println("This will never be printed");
      }
    }
  }

  // Method to return a condition that is always false
  private boolean getUnreachableCondition() {
    return false;
  }
}