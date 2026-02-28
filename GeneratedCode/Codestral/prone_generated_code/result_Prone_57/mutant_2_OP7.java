class FunctionalInterfaceMethodChangedBug {
  private static boolean getFalseCondition() {
    return false; // Method to provide false condition dynamically
  }

  public static String showBug() {
    // Lambda assigned to B interface
    B b = () -> {
      while (getFalseCondition()) { // Unreachable while loop
        System.out.println("This is an unreachable block");
      }
      return "Original Qux";
    };
    // Casting lambda to A interface changes behavior
    A a = (A) b;
    return a.bar(); // This will return "Bar in A changed to Original Qux" which is unexpected behavior
  }

  public static void main(String[] args) {
    System.out.println(showBug());
  }
}