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
    }

    // Mutated code
    String y;
    for (int j = 0; j < 100; j++) {
      y = "";
      if (j % 3 == 0) y = "Fizz";
      if (j % 5 == 0) y += "Buzz";
      if (y == "") y += j;
      System.out.println(j);
    }
  }
}