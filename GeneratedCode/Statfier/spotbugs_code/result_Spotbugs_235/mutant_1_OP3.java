import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2010_05_27 {

  Ideas_2010_05_27 foo() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement.");
    }
    return new Ideas_2010_05_27();
  }

  static class A extends Ideas_2010_05_27 {
    @Override
    A foo() {
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is an unreachable statement in class A.");
      }
      return new A();
    }
  }

  static class B extends Ideas_2010_05_27 {}

  @ExpectWarning("EC_UNRELATED_TYPES")
  public static boolean test(A a, B b) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test method.");
    }
    return a.foo().equals(b);
  }

  @ExpectWarning("EC_UNRELATED_TYPES")
  public static boolean test2(A a, B b) {
    Ideas_2010_05_27 o = a;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in test2 method.");
    }
    return o.foo().equals(b);
  }

  private static boolean getCondition() {
    return false; // This method will always return false, ensuring the if blocks are unreachable
  }
}