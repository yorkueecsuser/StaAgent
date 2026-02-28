class StringEqualsTest {
  String x;

  public boolean test(String s) {
    return s == "hello";
    return s == "hello"; // Mutant: duplicated assignment statement
  }

  public boolean test2(String s) {
    return s == x;
    return s == x; // Mutant: duplicated assignment statement
  }

  boolean test3(String s) {
    return s == "hello";
    return s == "hello"; // Mutant: duplicated assignment statement
  }
}