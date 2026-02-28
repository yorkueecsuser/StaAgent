import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3135098 {
  @NoWarning("SF_SWITCH_NO_DEFAULT")
  public int test1(MyEnum e) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test1");
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test2");
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test3");
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test3a");
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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test4");
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
    return false; // This method ensures the condition is dynamically determined but always false
  }
}