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
  public static boolean test(A x, B b) {
    return x.foo().equals(b);
  }

  @ExpectWarning("EC_UNRELATED_TYPES")
  public static boolean test2(A a, B y) {
    Ideas_2010_05_27 o = a;
    return o.foo().equals(y);
  }
}