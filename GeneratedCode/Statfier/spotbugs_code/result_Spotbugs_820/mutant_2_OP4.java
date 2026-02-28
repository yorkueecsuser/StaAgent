import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class SillyBoxedUsage {
  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad1(int value) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return new Integer(value).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood1(int value) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return Integer.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad2(float value) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return new Float(value).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood2(float value) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return Float.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad3(double value) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return new Double(value).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood3(double value) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return Double.toString(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testBad(byte b, char c, short s, long j, boolean z) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return new Byte(b).toString()
        + new Character(c).toString()
        + new Short(s).toString()
        + new Long(j).toString()
        + new Boolean(z).toString();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_TOSTRING")
  public String testGood(byte b, char c, short s, long j, boolean z) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return Byte.toString(b)
        + Character.toString(c)
        + Short.toString(s)
        + Long.toString(j)
        + Boolean.toString(z);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingBad1(String value) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return new Integer(value).intValue();
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingBad1a(String value) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return Integer.valueOf(value).intValue();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public int testParsingGood1(String value) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return Integer.parseInt(value);
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingBad2(String value) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return new Long(value).longValue();
  }

  @ExpectWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingBad2a(String value) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return Long.valueOf(value).longValue();
  }

  @NoWarning("DM_BOXED_PRIMITIVE_FOR_PARSING")
  public long testParsingGood2(String value) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    }
    return Long.parseLong(value);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}