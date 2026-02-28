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
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // Unreachable if-else statement
      return "unreachable";
    } else {
      return "also unreachable";
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

  private boolean getUnreachableCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}

enum EnumClass {
  VALUE1,
  VALUE2,
  VALUE3
}