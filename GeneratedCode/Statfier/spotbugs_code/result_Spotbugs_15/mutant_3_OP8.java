class StringEqualsTest {
  String x;

  public boolean test(String s) {
    return s == "hello";
  }

  public boolean test2(String s) {
    return s == x;
  }

  boolean test3(String s) {
    return s == "hello";
  }

  // Mutated code
  String y;

  public boolean test4(String t) {
    return t == "hello";
  }

  public boolean test5(String t) {
    return t == y;
  }

  boolean test6(String t) {
    return t == "hello";
  }
}