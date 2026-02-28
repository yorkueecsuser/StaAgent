class ForceClassInitialization {
  public static void main(String args[]) {
    Class c = InitializeMe.class;

    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is always executed
        System.out.println("This will always be printed");
        break;
    }
  }

  private static boolean getCondition() {
    // This method returns false, making the switch condition always evaluate to 1
    return false;
  }
}