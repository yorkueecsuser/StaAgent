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
    Ideas_2010_05_27 o_copy = a; // Duplicated assignment statement
    return o.foo().equals(b);
  }
}