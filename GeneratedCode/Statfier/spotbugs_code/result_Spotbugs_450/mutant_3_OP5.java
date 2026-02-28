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
  }

  @DesireWarning("SF_SWITCH_NO_DEFAULT")
  public int test3(MyEnum e) {
    switch (e) {
      case A:
        return 1;
    }
    return 3;
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
  }

  // Introduced unreachable switch statement
  public void unreachableSwitch() {
    boolean condition = getCondition();
    if (condition) {
      int value = getValue();
      switch (value) {
        case 0:
          System.out.println("Unreachable case 0");
          break;
        case 1:
          System.out.println("Unreachable case 1");
          break;
      }
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the switch unreachable
  }

  private int getValue() {
    return 0; // This method provides a value for the switch expression
  }

  private enum MyEnum {
    A,
    B
  }
}