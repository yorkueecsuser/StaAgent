import edu.umd.cs.findbugs.annotations.DesireWarning;

class Regression_2009_04_22 {

  Object alwaysNonNull() {
    return "X";
  }

  Object sometimesNull() {
    if (Math.random() > 0.5) return null;
    return "Y";
  }

  void check1() {
    Object x = alwaysNonNull();
    if (x == null) System.out.println("huh");
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) System.out.println("This is unreachable");
  }

  void check2() {
    Object x = alwaysNonNull();
    System.out.println(x.hashCode());
    if (x == null) System.out.println("huh");
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) System.out.println("This is unreachable");
  }

  @DesireWarning("RCN")
  void check3() {
    Object y = sometimesNull();
    System.out.println(y.hashCode());
    if (y == null) System.out.println("huh");
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) System.out.println("This is unreachable");
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}