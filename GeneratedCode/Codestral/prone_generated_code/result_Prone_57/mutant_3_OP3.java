class FunctionalInterfaceMethodChangedBug {
  private static boolean getUnreachableCondition() {
    return false;  // This method returns a false condition to make the if statement unreachable
  }

  public static String showBug() {
    B b = () -> "Original Qux";
    A a = (A) b;

    // Generated mutant code
    if (getUnreachableCondition()) {
      System.out.println("This code should be unreachable");
    }

    return a.bar();
  }

  // The rest of the code remains the same
}