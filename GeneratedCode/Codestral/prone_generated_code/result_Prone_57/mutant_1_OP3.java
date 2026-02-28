class FunctionalInterfaceMethodChangedBug {
  public static String showBug() {
    // Lambda assigned to B interface
    B b = () -> "Original Qux";
    // Casting lambda to A interface changes behavior
    A a = (A) b;

    // Unreachable if statement
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // This code will never be executed
      System.out.println("This is an unreachable if statement");
    }

    return a.bar(); // This will return "Bar in A changed to Original Qux"
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}