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
    String y = "hello";
    char e = y.charAt(5);
  }

  void constant_explicit_constructor_Good_mutant() {
    String z = new String("hello");
    char f = z.charAt(4);
  }

  void constant_explicit_constructor_Bad_mutant() {
    String a = new String("hello");
    char b = a.charAt(5);
  }

  void copy_constructor_Good_mutant() {
    String m = new String("hello");
    String n = new String(m);
    char o = n.charAt(4);
  }

  void copy_constructor_Bad_mutant() {
    String p = new String("hello");
    String q = new String(p);
    char r = q.charAt(5);
  }
}