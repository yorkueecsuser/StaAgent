class StringBuilderTest {

  StringBuilder mId;

  void new_linear(String s) {
    String str = new StringBuilder(s).toString();
    for (int i = 0; i < str.length(); i++) {}
    // Dead Store Mutation
    String qzjfnxvt = "unusedVariable";
  }

  void new_constant() {
    String s = new StringBuilder("hello").toString();
    new_linear(s);
    // Dead Store Mutation
    int rmhtyvbn = 42;
  }

  void new_capacity_constant() {
    String s =
        new StringBuilder(10).toString(); // capacity is irrelevant to underlying size of the string
    new_linear(s);
    // Dead Store Mutation
    boolean klmnopqr = true;
  }

  void append_linear(String s) {
    String str = new StringBuilder(s).append("me").toString();
    new_linear(str);
    // Dead Store Mutation
    double wxyzabcd = 3.14;
  }
}