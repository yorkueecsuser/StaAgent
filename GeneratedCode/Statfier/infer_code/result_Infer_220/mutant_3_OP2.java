class StringTest {
  void constant_Good() {
    String s = "hello";
    String s_duplicate = "hello"; // Mutant: duplicated assignment
    char c = s.charAt(4);
  }

  void constant_Bad() {
    String s = "hello";
    String s_duplicate = "hello"; // Mutant: duplicated assignment
    char c = s.charAt(5);
  }

  void constant_explicit_constructor_Good() {
    String s = new String("hello");
    String s_duplicate = new String("hello"); // Mutant: duplicated assignment
    char c = s.charAt(4);
  }

  void constant_explicit_constructor_Bad() {
    String s = new String("hello");
    String s_duplicate = new String("hello"); // Mutant: duplicated assignment
    char c = s.charAt(5);
  }

  void copy_constructor_Good() {
    String s = new String("hello");
    String t = new String(s);
    String t_duplicate = new String(s); // Mutant: duplicated assignment
    char c = t.charAt(4);
  }

  void copy_constructor_Bad() {
    String s = new String("hello");
    String t = new String(s);
    String t_duplicate = new String(s); // Mutant: duplicated assignment
    char c = t.charAt(5);
  }
}