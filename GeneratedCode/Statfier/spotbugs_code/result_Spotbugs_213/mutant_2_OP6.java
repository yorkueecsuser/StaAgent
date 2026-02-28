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
      boolean conditionFor = getCondition();
      for (int j = 0; conditionFor; j++) {
        // This loop is unreachable because getCondition() will always return false
        System.out.println("This is an unreachable loop");
      }
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}