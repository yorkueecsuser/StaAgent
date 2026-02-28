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
    boolean conditionWhile = getConditionForWhileLoop(); // Inserted method call to determine the condition for the while loop
    while (conditionWhile) {
      // Unreachable while loop
      // This block of code is never executed
    }
    return "Bar in A changed to " + qux();
  }
}

class FunctionalInterfaceMethodChangedBug {
  public static String showBug() {
    B b = () -> "Original Qux";
    A a = (A) b;
    return a.bar(); // This will return "Bar in A changed to Original Qux"
  }

  public static boolean getConditionForWhileLoop() {
    // This method always returns false, making the while loop unreachable
    return false;
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}