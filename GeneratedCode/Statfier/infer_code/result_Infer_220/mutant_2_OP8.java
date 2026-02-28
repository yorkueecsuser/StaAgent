class StringTest {
  void constant_Good() {
    String s = "hello";
    char c = s.charAt(4);
  }

  void constant_Bad() {
    String s = "hello";
    char c = s.charAt(5);
  }

  void constant_explicit_constructor_Good() {
    String s = new String("hello");
    char c = s.charAt(4);
  }

  void constant_explicit_constructor_Bad() {
    String s = new String("hello");
    char c = s.charAt(5);
  }

  void copy_constructor_Good() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(4);
  }

  void copy_constructor_Bad() {
    String s = new String("hello");
    String t = new String(s);
    char c = t.charAt(5);
  }

  // Mutants
  void constant_Good_mutant() {
    String x = "hello";
    char d = x.charAt(4);
  }

  void constant_Bad_mutant() {
    String x = "hello";
    char d = x.charAt(5);
  }

  void constant_explicit_constructor_Good_mutant() {
    String y = new String("hello");
    char e = y.charAt(4);
  }

  void constant_explicit_constructor_Bad_mutant() {
    String y = new String("hello");
    char e = y.charAt(5);
  }

  void copy_constructor_Good_mutant() {
    String z = new String("hello");
    String w = new String(z);
    char f = w.charAt(4);
  }

  void copy_constructor_Bad_mutant() {
    String z = new String("hello");
    String w = new String(z);
    char f = w.charAt(5);
  }
}