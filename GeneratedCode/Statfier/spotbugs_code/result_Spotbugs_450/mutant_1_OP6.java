import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3135098 {
  @NoWarning("SF_SWITCH_NO_DEFAULT")
  public int test1(MyEnum e) {
    switch (e) {
      case A:
        boolean conditionFor1 = getCondition();
        for (int i = 0; conditionFor1; i++) {} // Unreachable for loop
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
        boolean conditionFor2 = getCondition();
        for (int i = 0; conditionFor2; i++) {} // Unreachable for loop
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
        boolean conditionFor3 = getCondition();
        for (int i = 0; conditionFor3; i++) {} // Unreachable for loop
        return 1;
    }
    return 3;
  }

  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  /** Has bytecode identical to the above */
  public int test3a(MyEnum e) {
    switch (e) {
      case A:
        boolean conditionFor4 = getCondition();
        for (int i = 0; conditionFor4; i++) {} // Unreachable for loop
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
        boolean conditionFor5 = getCondition();
        for (int i = 0; conditionFor5; i++) {} // Unreachable for loop
        break;
    }
    return result;
  }

  private enum MyEnum {
    A,
    B
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the loops are unreachable
  }
}