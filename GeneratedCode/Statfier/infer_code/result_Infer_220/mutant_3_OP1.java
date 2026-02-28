class StringTest {
  void constant_Good() {
    String s = "hello";
    char c = s.charAt(4);
    String abcdefgh = "unused"; // Dead Store
  }

  void constant_Bad() {
    String s = "hello";
    char c = s.charAt(5);
    int hijklmno = 42; // Dead Store
  }

  void constant_explicit_constructor_Good() {
    String s = new String("hello");
    char c = s.charAt(4);
    boolean pqrsutvw = true; // Dead Store
  }

  void constant_explicit_constructor_Bad() {
    String s = new String("hello");
    char c = s.charAt(5);
    double xyzabcde = 3.14; // Dead Store
  }

  void copy_constructor_Good() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(4);
    float fghijklm = 2.718f; // Dead Store
  }

  void copy_constructor_Bad() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(5);
    long nopqrstu = 987654321L; // Dead Store
  }
}