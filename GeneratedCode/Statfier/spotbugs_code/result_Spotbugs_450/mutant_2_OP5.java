import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3135098 {
  @NoWarning("SF_SWITCH_NO_DEFAULT")
  public int test1(MyEnum e) {
    switch (e) {
      case A:
        return 1;
      case B:
        return 2;
    }
    return 3;

    // Unreachable switch statement
    boolean condition = getCondition();
    if (condition) {
      int unreachableValue = getValue();
      switch (unreachableValue) {
        case 1:
          return 4;
        case 2:
          return 5;
      }
    }
  }

  @NoWarning("SF_SWITCH_NO_DEFAULT")
  public int test2(MyEnum e) {
    int result = 0;
    switch (e) {
      case A:
        result = 1;
        break;
      case B:
        result = 2;
        break;
    }
    return result;

    // Unreachable switch statement
    boolean condition = getCondition();
    if (condition) {
      int unreachableValue = getValue();
      switch (unreachableValue) {
        case 1:
          result = 4;
          break;
        case 2:
          result = 5;
          break;
      }
    }
  }

  @DesireWarning("SF_SWITCH_NO_DEFAULT")
  public int test3(MyEnum e) {
    switch (e) {
      case A:
        return 1;
    }
    return 3;

    // Unreachable switch statement
    boolean condition = getCondition();
    if (condition) {
      int unreachableValue = getValue();
      switch (unreachableValue) {
        case 1:
          return 4;
        case 2:
          return 5;
      }
    }
  }

  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  /** Has bytecode identical to the above */
  public int test3a(MyEnum e) {
    switch (e) {
      case A:
        return 1;
      default:
        return 3;
    }

    // Unreachable switch statement
    boolean condition = getCondition();
    if (condition) {
      int unreachableValue = getValue();
      switch (unreachableValue) {
        case 1:
          return 4;
        case 2:
          return 5;
      }
    }
  }

  @ExpectWarning("SF_SWITCH_NO_DEFAULT")
  public int test4(MyEnum e) {
    int result = 0;
    switch (e) {
      case A:
        result = 1;
        break;
    }
    return result;

    // Unreachable switch statement
    boolean condition = getCondition();
    if (condition) {
      int unreachableValue = getValue();
      switch (unreachableValue) {
        case 1:
          result = 4;
          break;
        case 2:
          result = 5;
          break;
      }
    }
  }

  private enum MyEnum {
    A,
    B
  }

  private boolean getCondition() {
    return false; // This will ensure the condition is false at runtime, making the switch unreachable
  }

  private int getValue() {
    return 0; // This value does not matter since the switch is unreachable
  }
}