import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
class SwitchEnum {
  int[] a = new int[8];

  // Java generates a class for the switch, which contains an int array
  // This leads to races where there are int arrays, here a[]
  public String getName(EnumClass value) {
    synchronized (this) {
      a[0] = 0; // should not report here
    }
    // Introduced an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    switch (value) {
      case VALUE1:
        return "value 1";
      case VALUE3:
        return "value 3";
      default:
        return "other";
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false;
  }
}

enum EnumClass {
  VALUE1,
  VALUE2,
  VALUE3
}