import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug3463932 {

  @DesireNoWarning("RC_REF_COMPARISON")
  public static void case1() {
    Integer i1 = 1;
    Integer i2 = 2;
    boolean different = i1!= i2 && (i1 == null ||!i1.equals(i2));

    System.err.println("1 == 2: " + different);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is an unreachable case");
        break;
    }
  }

  @DesireNoWarning("RC_REF_COMPARISON")
  public static void case2() {
    Integer i1 = 1;
    Integer i2 = 2;
    boolean different = i1!= i2 &&!i1.equals(i2);

    System.err.println("1 == 2: " + different);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is another unreachable case");
        break;
    }
  }

  public static void main(String args[]) {
    case1();
    case2();
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}