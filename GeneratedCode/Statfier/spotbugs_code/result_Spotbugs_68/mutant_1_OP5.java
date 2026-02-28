import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug3463932 {

  @DesireNoWarning("RC_REF_COMPARISON")
  public static void case1() {
    Integer i1 = 1;
    Integer i2 = 2;
    boolean different = i1!= i2 && (i1 == null ||!i1.equals(i2));

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }

    System.err.println("1 == 2: " + different);
  }

  @DesireNoWarning("RC_REF_COMPARISON")
  public static void case2() {
    Integer i1 = 1;
    Integer i2 = 2;
    boolean different = i1!= i2 &&!i1.equals(i2);

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }

    System.err.println("1 == 2: " + different);
  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }

  public static void main(String args[]) {
    case1();
    case2();
  }
}