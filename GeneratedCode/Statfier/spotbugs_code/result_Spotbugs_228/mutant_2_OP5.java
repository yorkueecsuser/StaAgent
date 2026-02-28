class EqualButNotEqual {

  public static void main(String args[]) {
    Double d = Double.valueOf(Double.NaN);
    Double d2 = Double.valueOf(Double.NaN);

    System.out.println(d == Float.NaN);
    System.out.println(d.equals(Float.NaN));

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is an unreachable case.");
        break;
      default:
        // This default case will also never be reached because condition is always false
        System.out.println("This is also an unreachable case.");
        break;
    }
  }

  // Method to provide a dynamic condition that always evaluates to false
  private static boolean getCondition() {
    return false;
  }
}