class SkippedSourceFile {

  static Object createdBySkippedFile() {
    return null;
  }

  // Introduced mutant: Unreachable switch statement
  static void unreachableSwitch() {
    boolean condition = getCondition();
    switch (condition? 0 : 1) { // This will always evaluate to 1, making the switch statement effectively unreachable
      case 0:
        System.out.println("This will never be printed");
        break;
      default:
        // Default case to avoid compiler warning
        break;
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, but it's not a compile-time constant
  }
}