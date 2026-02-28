class StringEqualsTest {
  String x;

  public boolean test(String s) {
    return s == "hello";
    return s == "hello"; // Mutant: Duplicate of the original return statement
  }

  public boolean test2(String s) {
    return s == x;
  }

  boolean test3(String s) {
    return s == "hello";
    return s == "hello"; // Mutant: Duplicate of the original return statement
  }
}