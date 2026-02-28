class Ideas_2008_09_17 {

  public static int getInt1(String s) {
    long result = Long.parseLong(s);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      result = 0;
    }
    return (int) (result & 0xEFFFFFFF);
  }

  public static int getInt2(String s) {
    long result = Long.parseLong(s);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      result = 0;
    }
    return (int) (0xEFFFFFFF & result);
  }

  public static int getInt3(String s) {
    long result = Long.parseLong(s);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      result = 0;
    }
    return (int) (result) & 0xEFFFFFFF;
  }

  public static int getInt4(String s) {
    long result = Long.parseLong(s);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      result = 0;
    }
    return 0xEFFFFFFF & (int) result;
  }

  public static int getInt5(String s) {
    int result = Integer.parseInt(s);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      result = 0;
    }
    return (result & 0xEFFFFFFF);
  }

  public static int getInt6(String s) {
    int result = Integer.parseInt(s);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      result = 0;
    }
    return (0xEFFFFFFF & result);
  }

  public static long getLong1(String s) {
    long result = Long.parseLong(s);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      result = 0;
    }
    return (result & 0xEFFFFFFFFFFFFFFFL);
  }

  public static long getLong2(String s) {
    long result = Long.parseLong(s);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      result = 0;
    }
    return (0xEFFFFFFFFFFFFFFFL & result);
  }

  private static boolean getCondition() {
    // This method ensures the condition is not a compile-time constant
    return false;
  }
}