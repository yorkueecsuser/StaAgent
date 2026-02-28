import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3135098 {
  @NoWarning("SF_SWITCH_NO_DEFAULT")
  public int test1(MyEnum e) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        return 999;
      } else {
        return 888;
      }
    }
    switch (e) {
      case A:
        return 1;
      case B:
        return 2;
    }
    return 3;
  }

  @NoWarning("SF_SWITCH_NO_DEFAULT")
  public int test2(MyEnum e) {
    int result = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        result = 999;
      } else {
        result = 888;
      }
    }
    switch (e) {
      case A:
        result = 1;
        break;
      case B:
        result = 2;
        break;
    }
    return result;
  }

  @DesireWarning("SF_SWITCH_NO_DEFAULT")
  public int test3(MyEnum e) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        return 999;
      } else {
        return 888;
      }
    }
    switch (e) {
      case A:
        return 1;
    }
    return 3;
  }

  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  /** Has bytecode identical to the above */
  public int test3a(MyEnum e) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        return 999;
      } else {
        return 888;
      }
    }
    switch (e) {
      case A:
        return 1;
      default:
        return 3;
    }
  }

  @ExpectWarning("SF_SWITCH_NO_DEFAULT")
  public int test4(MyEnum e) {
    int result = 0;
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable if-else statement
      if (getFalseCondition()) {
        result = 999;
      } else {
        result = 888;
      }
    }
    switch (e) {
      case A:
        result = 1;
        break;
    }
    return result;
  }

  private enum MyEnum {
    A,
    B
  }

  private boolean getCondition() {
    return true; // This can be any dynamic condition
  }

  private boolean getFalseCondition() {
    return false; // This will always be false, but it's not a compile-time constant
  }
}