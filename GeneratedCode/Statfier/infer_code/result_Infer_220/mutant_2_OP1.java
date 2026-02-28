class StringTest {
  void constant_Good() {
    String s = "hello";
    char c = s.charAt(4);
    // Dead store mutation
    String abcdefgh = "unused";
  }

  void constant_Bad() {
    String s = "hello";
    char c = s.charAt(5);
    // Dead store mutation
    int hijklmno = 42;
  }

  void constant_explicit_constructor_Good() {
    String s = new String("hello");
    char c = s.charAt(4);
    // Dead store mutation
    boolean pqrsutvw = true;
  }

  void constant_explicit_constructor_Bad() {
    String s = new String("hello");
    char c = s.charAt(5);
    // Dead store mutation
    double xyzabcde = 3.14;
  }

  void copy_constructor_Good() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(4);
    // Dead store mutation
    long fghijklm = 123456789L;
  }

  void copy_constructor_Bad() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(5);
    // Dead store mutation
    char nopqrstu = 'x';
  }
}