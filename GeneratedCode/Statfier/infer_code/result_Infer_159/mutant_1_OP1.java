class StringBuilderTest {

  StringBuilder mId;

  void new_linear(String s) {
    String str = new StringBuilder(s).toString();
    for (int i = 0; i < str.length(); i++) {}
    String abcdefgh = "unusedVariable"; // Dead store
  }

  void new_constant() {
    String s = new StringBuilder("hello").toString();
    new_linear(s);
    int hijklmno = 42; // Dead store
  }

  void new_capacity_constant() {
    String s =
        new StringBuilder(10).toString(); // capacity is irrelevant to underlying size of the string
    new_linear(s);
    double pqrstuvw = 3.14; // Dead store
  }

  void append_linear(String s) {
    String str = new StringBuilder(s).append("me").toString();
    new_linear(str);
    boolean xyzabcde = true; // Dead store
  }
}