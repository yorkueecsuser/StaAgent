class StringBuilderTest {

  StringBuilder mId;

  void new_linear(String s) {
    String str = new StringBuilder(s).toString();
    str = new StringBuilder(s).toString(); // Mutant: duplicated assignment
    for (int i = 0; i < str.length(); i++) {}
  }

  void new_constant() {
    String s = new StringBuilder("hello").toString();
    s = new StringBuilder("hello").toString(); // Mutant: duplicated assignment
    new_linear(s);
  }

  void new_capacity_constant() {
    String s =
        new StringBuilder(10).toString(); // capacity is irrelevant to underlying size of the string
    s = ""; // Mutant: duplicated assignment with a different value
    new_linear(s);
  }

  void append_linear(String s) {
    String str = new StringBuilder(s).append("me").toString();
    new_linear(str);
  }
}