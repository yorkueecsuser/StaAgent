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

  // Mutant 1: Renamed'result' to 'x'
  @NoWarning("SF_SWITCH_NO_DEFAULT")
  public int test1a(MyEnum e) {
    int x = 0;
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

  // Mutant 2: Renamed'result' to 'y'
  @NoWarning("SF_SWITCH_NO_DEFAULT")
  public int test2a(MyEnum e) {
    int y = 0;
    switch (e) {
      case A:
        y = 1;
        break;
      case B:
        y = 2;
        break;
    }
    return y;
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

  // Mutant 3: Renamed'result' to 'z'
  @ExpectWarning("SF_SWITCH_NO_DEFAULT")
  public int test4a(MyEnum e) {
    int z = 0;
    switch (e) {
      case A:
        z = 1;
        break;
    }
    return z;
  }

  private enum MyEnum {
    A,
    B
  }
}