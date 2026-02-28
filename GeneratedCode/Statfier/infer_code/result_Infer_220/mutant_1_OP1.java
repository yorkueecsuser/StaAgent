class StringTest {
  void constant_Good() {
    String s = "hello";
    char c = s.charAt(4);
    // Mutant: Dead Store
    String abcdefgh = "unused";
  }

  void constant_Bad() {
    String s = "hello";
    char c = s.charAt(5);
    // Mutant: Dead Store
    int ijklmnop = 123;
  }

  void constant_explicit_constructor_Good() {
    String s = new String("hello");
    char c = s.charAt(4);
    // Mutant: Dead Store
    boolean opqrstuv = true;
  }

  void constant_explicit_constructor_Bad() {
    String s = new String("hello");
    char c = s.charAt(5);
    // Mutant: Dead Store
    double vwxyzabc = 3.14;
  }

  void copy_constructor_Good() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(4);
    // Mutant: Dead Store
    long defghijk = 987654321L;
  }

  void copy_constructor_Bad() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(5);
    // Mutant: Dead Store
    float lmnopqrs = 2.71f;
  }
}