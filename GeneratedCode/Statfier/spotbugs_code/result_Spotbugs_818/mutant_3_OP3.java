import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug1911620 {
  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING,DLS_DEAD_LOCAL_STORE_IN_RETURN")
  public long getLongMinus1(String longStr) {
    long l = Long.valueOf(longStr);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      l = 0;
    }
    return --l;
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING,DLS_DEAD_LOCAL_STORE_IN_RETURN")
  public long getLongPlus1(String longStr) {
    long l = Long.valueOf(longStr);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      l = 0;
    }
    return ++l;
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING,DLS_DEAD_LOCAL_STORE")
  public long getLongMinus1Bad(String longStr) {
    long l = Long.valueOf(longStr);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      l = 0;
    }
    return l--;
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING,DLS_DEAD_LOCAL_STORE")
  public long getLongPlus1Bad(String longStr) {
    long l = Long.valueOf(longStr);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      l = 0;
    }
    return l++;
  }

  public static void main(String[] args) {
    System.out.println(new Bug1911620().getLongPlus1Bad("1"));
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING,DLS_DEAD_LOCAL_STORE")
  public long getLongWithDLS(String longStr) {
    long l = Long.valueOf(longStr);
    long l2 = l; // This is the only place FindBugs should give a DLS
    // warning
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      l2 = 0;
    }
    return l;
  }

  @NoWarning("DLS")
  public long getLongMinus1_2(String longStr) {
    long l = Long.parseLong(longStr);
    --l;
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      l = 0;
    }
    return l;
  }

  @NoWarning("DLS")
  public long getLongMinus2(String longStr) {
    long l = Long.parseLong(longStr);
    return l - 2;
  }

  @NoWarning("DLS")
  public int getIntMinus1(String intStr) {
    int i = Integer.parseInt(intStr);
    return --i;
  }

  @ExpectWarning("DLS_DEAD_LOCAL_INCREMENT_IN_RETURN")
  public int getIntMinus1Bad(String intStr) {
    int i = Integer.parseInt(intStr);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      i = 0;
    }
    return i--;
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }
}