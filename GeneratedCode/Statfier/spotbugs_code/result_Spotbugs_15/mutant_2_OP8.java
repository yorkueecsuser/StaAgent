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

  public boolean test4(String a) {
    return a == "hello";
  }

  public boolean test5(String a) {
    return a == y;
  }

  boolean test6(String a) {
    return a == "hello";
  }
}