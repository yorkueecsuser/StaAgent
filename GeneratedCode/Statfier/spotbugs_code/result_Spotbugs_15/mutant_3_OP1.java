class StringEqualsTest {
  String x;

  public boolean test(String s) {
    String jxqzfnbt; // Dead store mutation
    return s == "hello";
  }

  public boolean test2(String s) {
    int vbnrhtys; // Dead store mutation
    return s == x;
  }

  boolean test3(String s) {
    boolean klmwpoju; // Dead store mutation
    return s == "hello";
  }
}