import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2010_05_27 {

  Ideas_2010_05_27 foo() {
    return new Ideas_2010_05_27();
  }

  static class A extends Ideas_2010_05_27 {
    @Override
    A foo() {
      return new A();
    }
  }

  static class B extends Ideas_2010_05_27 {}

  @ExpectWarning("EC_UNRELATED_TYPES")
  public static boolean test(A a, B b) {
    return a.foo().equals(b);
  }

  @ExpectWarning("EC_UNRELATED_TYPES")
  public static boolean test2(A a, B b) {
    Ideas_2010_05_27 o = a;
    return o.foo().equals(b);
  }

  // Mutant 1: Renaming variable 'a' to 'x' in test method
  @ExpectWarning("EC_UNRELATED_TYPES")
  public static boolean test_m1(x x, B b) {
    return x.foo().equals(b);
  }

  // Mutant 2: Renaming variable 'b' to 'y' in test2 method
  @ExpectWarning("EC_UNRELATED_TYPES")
  public static boolean test2_m2(A a, y y) {
    Ideas_2010_05_27 o = a;
    return o.foo().equals(y);
  }

  // Mutant 3: Renaming variable 'o' to 'z' in test2 method
  @ExpectWarning("EC_UNRELATED_TYPES")
  public static boolean test2_m3(A a, B b) {
    Ideas_2010_05_27 z = a;
    return z.foo().equals(b);
  }
}