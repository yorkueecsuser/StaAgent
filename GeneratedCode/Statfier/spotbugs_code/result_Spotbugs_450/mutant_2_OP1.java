import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3135098 {
  @NoWarning("SF_SWITCH_NO_DEFAULT")
  public int test1(MyEnum e) {
    String unusedVar1 = "abcdefgh"; // Dead store
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
    int unusedVar2 = 12345678; // Dead store
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
    double unusedVar3 = 3.14159265; // Dead store
    switch (e) {
      case A:
        return 1;
    }
    return 3;
  }

  @DesireNoWarning("SF_SWITCH_NO_DEFAULT")
  /** Has bytecode identical to the above */
  public int test3a(MyEnum e) {
    char unusedVar4 = 'z'; // Dead store
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
    boolean unusedVar5 = true; // Dead store
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
}