import edu.umd.cs.findbugs.annotations.DesireNoWarning;

class Bug3463932 {

  @DesireNoWarning("RC_REF_COMPARISON")
  public static void case1() {
    Integer i1 = 1;
    Integer i2 = 2;
    boolean different = i1!= i2 && (i1 == null ||!i1.equals(i2));

    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }

    System.err.println("1 == 2: " + different);
  }

  @DesireNoWarning("RC_REF_COMPARISON")
  public static void case2() {
    Integer i1 = 1;
    Integer i2 = 2;
    boolean different = i1!= i2 &&!i1.equals(i2);

    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed either");
    } else {
      System.out.println("This will also never be printed either");
    }

    System.err.println("1 == 2: " + different);
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }

  public static void main(String args[]) {
    case1();
    case2();
  }
}