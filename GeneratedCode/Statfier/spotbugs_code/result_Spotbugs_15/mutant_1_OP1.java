class StringEqualsTest {
  String x;

  public boolean test(String s) {
    String abcdefgh = "unused"; // Dead Store mutation
    return s == "hello";
  }

  public boolean test2(String s) {
    int ijklmnop = 42; // Dead Store mutation
    return s == x;
  }

  boolean test3(String s) {
    double opqrstuv = 3.14; // Dead Store mutation
    return s == "hello";
  }
}