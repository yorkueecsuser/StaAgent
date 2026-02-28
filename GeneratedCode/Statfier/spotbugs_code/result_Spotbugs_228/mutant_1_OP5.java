class EqualButNotEqual {

  public static void main(String args[]) {
    Double d = Double.valueOf(Double.NaN);
    Double d2 = Double.valueOf(Double.NaN);

    System.out.println(d == Float.NaN);
    System.out.println(d.equals(Float.NaN));

    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition? 0 : 1 will always evaluate to 1
        System.out.println("This is an unreachable case");
        break;
      case 1:
        // This is the only reachable case
        System.out.println("This is the reachable case");
        break;
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the switch is unreachable
  }
}