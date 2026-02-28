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
    int x = 0; // Renamed'result' to 'x'
    switch (e) {
      case A:
        x = 1;
        break;
      case B:
        x = 2;
        break;
    }
    return x;
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
    int y = 0; // Renamed'result' to 'y'
    switch (e) {
      case A:
        y = 1;
        break;
    }
    return y;
  }

  private enum MyEnum {
    A,
    B
  }
}