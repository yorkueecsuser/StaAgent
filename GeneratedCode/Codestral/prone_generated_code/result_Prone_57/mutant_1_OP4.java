class FunctionalInterfaceMethodChangedBug {
  public static String showBug() {
    // Lambda assigned to B interface
    B b = () -> "Original Qux";

    // Added unreachable if-else branch
    boolean unreachableCondition = false;
    if (unreachableCondition) {
      // Unreachable code
      System.out.println("This code is unreachable");
    } else {
      // Original code
      // Casting lambda to A interface changes behavior
      A a = (A) b;
      return a.bar(); // This will return "Bar in A changed to Original Qux"
    }
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}