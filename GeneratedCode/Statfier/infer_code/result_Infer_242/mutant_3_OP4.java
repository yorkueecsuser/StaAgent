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
    switch (value) {
      case VALUE1:
        return "value 1";
      case VALUE3:
        return "value 3";
      default:
        return "other";
    }

    // Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because the method returns before reaching here
      a[1] = 1;
    } else {
      // This block will also never execute for the same reason
      a[1] = 2;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }
}

enum EnumClass {
  VALUE1,
  VALUE2,
  VALUE3
}