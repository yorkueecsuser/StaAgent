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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? MyEnum.A : MyEnum.B) {
      case A:
        if (getCondition()) {
          return 4; // This will never be reached
        }
        break;
      case B:
        if (getCondition()) {
          return 5; // This will never be reached
        }
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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? MyEnum.A : MyEnum.B) {
      case A:
        if (getCondition()) {
          return 6; // This will never be reached
        }
        break;
      case B:
        if (getCondition()) {
          return 7; // This will never be reached
        }
        break;
    }
    return result;
  }

  private enum MyEnum {
    A,
    B
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method can be modified to return true/false dynamically
  }
}