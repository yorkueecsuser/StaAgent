class StringEqualsTest {
  String x;

  public boolean test(String s) {
    String abcdefgh = "unused"; // Dead Store Mutation
    return s == "hello";
  }

  public boolean test2(String s) {
    int ijklmnop = 42; // Dead Store Mutation
    return s == x;
  }

  boolean test3(String s) {
    boolean opqrstuv = true; // Dead Store Mutation
    return s == "hello";
  }
}