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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test method.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test method.");
    }
    return a.foo().equals(b);
  }

  @ExpectWarning("EC_UNRELATED_TYPES")
  public static boolean test2(A a, B b) {
    Ideas_2010_05_27 o = a;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code in test2 method.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code in test2 method.");
    }
    return o.foo().equals(b);
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}