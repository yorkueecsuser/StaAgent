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

    // Introduced unreachable switch statement
    boolean condition = false; // This will always be false, ensuring the switch is unreachable
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      case 2:
        System.out.println("This is also unreachable");
        break;
    }
  }

  void check2() {
    Object x = alwaysNonNull();
    System.out.println(x.hashCode());
    if (x == null) System.out.println("huh");

    // Introduced unreachable switch statement
    boolean condition = false; // This will always be false, ensuring the switch is unreachable
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      case 2:
        System.out.println("This is also unreachable");
        break;
    }
  }

  @DesireWarning("RCN")
  void check3() {
    Object y = sometimesNull();
    System.out.println(y.hashCode());
    if (y == null) System.out.println("huh");

    // Introduced unreachable switch statement
    boolean condition = false; // This will always be false, ensuring the switch is unreachable
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      case 2:
        System.out.println("This is also unreachable");
        break;
    }
  }

  // Helper method to ensure the switch condition is not a compile-time constant
  private int getValue(boolean condition) {
    return condition? 1 : 0;
  }
}