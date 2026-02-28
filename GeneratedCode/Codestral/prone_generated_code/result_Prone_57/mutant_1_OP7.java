// Interfaces A and B where B extends A
@FunctionalInterface
interface A {
  String bar();
}

@FunctionalInterface
interface B extends A {
  String qux();
  @Override
  default String bar() {
    boolean conditionWhile = getCondition(); // Unreachable while loop mutation
    while (conditionWhile) {  // Always false, so the loop is unreachable
      // This code will never be executed
    }
    return "Bar in A changed to " + qux();
  }
}

class FunctionalInterfaceMethodChangedBug {
  public static boolean getCondition() {
    return false;
  }

  public static String showBug() {
    // Lambda assigned to B interface
    B b = () -> "Original Qux";
    // Casting lambda to A interface changes behavior
    A a = (A) b;
    return a.bar();
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}