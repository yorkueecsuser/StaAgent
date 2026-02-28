class FunctionalInterfaceMethodChangedBug {
  public static String showBug() {
    // Lambda assigned to B interface
    B b = () -> "Original Qux";
    // Casting lambda to A interface changes behavior
    A a = (A) b;

    // Unreachable for loop inserted here
    boolean conditionFor = false;
    for (int i = 0; conditionFor; i++) {
      // This code will never execute
      System.out.println("This is an unreachable loop!");
    }

    return a.bar(); // This will return "Bar in A changed to Original Qux" which is unexpected behavior
  }

  // Remaining code remains the same
}