class StringBuilderTest {

  StringBuilder mId;

  void new_linear(String s) {
    String str = new StringBuilder(s).toString();
    for (int i = 0; i < str.length(); i++) {}
    
    // Mutant: Renaming variable'str' to 'a'
    String a = new StringBuilder(s).toString();
    for (int j = 0; j < a.length(); j++) {}
  }

  void new_constant() {
    String s = new StringBuilder("hello").toString();
    new_linear(s);
    
    // Mutant: Renaming variable's' to 'b'
    String b = new StringBuilder("hello").toString();
    new_linear(b);
  }

  void new_capacity_constant() {
    String s =
        new StringBuilder(10).toString(); // capacity is irrelevant to underlying size of the string
    new_linear(s);
    
    // Mutant: Renaming variable's' to 'c'
    String c =
        new StringBuilder(10).toString(); // capacity is irrelevant to underlying size of the string
    new_linear(c);
  }

  void append_linear(String s) {
    String str = new StringBuilder(s).append("me").toString();
    new_linear(str);
    
    // Mutant: Renaming variable'str' to 'd'
    String d = new StringBuilder(s).append("me").toString();
    new_linear(d);
  }
}