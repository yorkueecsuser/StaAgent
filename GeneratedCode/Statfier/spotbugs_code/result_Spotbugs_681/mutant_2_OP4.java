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

    // Mutant: Unreachable if-else statement
    boolean condition = Math.random() < -1; // This condition is always false
    if (condition) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable but necessary to avoid compiler error");
    }
  }

  void check2() {
    Object x = alwaysNonNull();
    System.out.println(x.hashCode());
    if (x == null) System.out.println("huh");

    // Mutant: Unreachable if-else statement
    boolean condition = Math.random() < -1; // This condition is always false
    if (condition) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable but necessary to avoid compiler error");
    }
  }

  @DesireWarning("RCN")
  void check3() {
    Object y = sometimesNull();
    System.out.println(y.hashCode());
    if (y == null) System.out.println("huh");

    // Mutant: Unreachable if-else statement
    boolean condition = Math.random() < -1; // This condition is always false
    if (condition) {
      System.out.println("This is unreachable");
    } else {
      System.out.println("This is also unreachable but necessary to avoid compiler error");
    }
  }
}