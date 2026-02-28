class FunctionalInterfaceMethodChangedBug {
  public static String showBug() {
    // Lambda assigned to B interface
    B b = () -> "Original Qux";
    // Casting lambda to A interface changes behavior
    A a = (A) b;

    // Insert unreachable switch statement
    boolean condition = getCondition(); // Dynamically determine the condition
    if (condition) {
      int value = getValue(); // Dynamically determine the switch value
      switch (value) {
        case 1:
          // This code is unreachable as the condition is always false
          System.out.println("Unreachable switch statement");
          break;
      }
    }

    return a.bar();
  }

  private static boolean getCondition() {
    return false; // Always return false to make the switch statement unreachable
  }

  private static int getValue() {
    return 0; // Return a value that is not 1
  }

  // Other methods and the main method remain unchanged
}