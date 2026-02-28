import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class SillyBoxedUsage {
  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad1(int value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new Integer(value).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood1(int value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return Integer.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad2(float value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new Float(value).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood2(float value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return Float.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad3(double value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new Double(value).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood3(double value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return Double.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad(byte b, char c, short s, long j, boolean z) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new Byte(b).toString()
        + new Character(c).toString()
        + new Short(s).toString()
        + new Long(j).toString()
        + new Boolean(z).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood(byte b, char c, short s, long j, boolean z) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return Byte.toString(b)
        + Character.toString(c)
        + Short.toString(s)
        + Long.toString(j)
        + Boolean.toString(z);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingBad1(String value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new Integer(value).intValue();
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingBad1a(String value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return Integer.valueOf(value).intValue();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingGood1(String value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return Integer.parseInt(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingBad2(String value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return new Long(value).longValue();
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingBad2a(String value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return Long.valueOf(value).longValue();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingGood2(String value) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return Long.parseLong(value);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}