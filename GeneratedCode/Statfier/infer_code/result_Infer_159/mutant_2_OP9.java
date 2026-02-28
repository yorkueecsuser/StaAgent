class StringBuilderTest {

  StringBuilder mId;

  void new_linear(String s) {
    String str = new StringBuilder(s).toString();
    int i = 0;
    do {
      if (i >= str.length()) break;
    } while (true);
  }

  void new_constant() {
    String s = new StringBuilder("hello").toString();
    new_linear(s);
  }

  void new_capacity_constant() {
    String s =
        new StringBuilder(10).toString(); // capacity is irrelevant to underlying size of the string
    new_linear(s);
  }

  void append_linear(String s) {
    String str = new StringBuilder(s).append("me").toString();
    new_linear(str);
  }
}