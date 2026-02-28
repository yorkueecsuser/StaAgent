class Ideas_2008_09_17 {

  public static int getInt1(String s) {
    long result = Long.parseLong(s);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      result = result + 1;
    } else {
      // Another unreachable code
      result = result - 1;
    }
    return (int) (result & 0xEFFFFFFF);
  }

  public static int getInt2(String s) {
    long result = Long.parseLong(s);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      result = result * 2;
    } else {
      // Another unreachable code
      result = result / 2;
    }
    return (0xEFFFFFFF & result);
  }

  public static int getInt3(String s) {
    long result = Long.parseLong(s);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      result = result ^ 3;
    } else {
      // Another unreachable code
      result = result | 3;
    }
    return (int) (result) & 0xEFFFFFFF;
  }

  public static int getInt4(String s) {
    long result = Long.parseLong(s);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      result = result % 5;
    } else {
      // Another unreachable code
      result = result + 5;
    }
    return 0xEFFFFFFF & (int) result;
  }

  public static int getInt5(String s) {
    int result = Integer.parseInt(s);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      result = result - 7;
    } else {
      // Another unreachable code
      result = result + 7;
    }
    return (result & 0xEFFFFFFF);
  }

  public static int getInt6(String s) {
    int result = Integer.parseInt(s);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      result = result * 8;
    } else {
      // Another unreachable code
      result = result / 8;
    }
    return (0xEFFFFFFF & result);
  }

  public static long getLong1(String s) {
    long result = Long.parseLong(s);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      result = result << 1;
    } else {
      // Another unreachable code
      result = result >> 1;
    }
    return (result & 0xEFFFFFFFFFFFFFFFL);
  }

  public static long getLong2(String s) {
    long result = Long.parseLong(s);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      result = result >>> 2;
    } else {
      // Another unreachable code
      result = result << 2;
    }
    return (0xEFFFFFFFFFFFFFFFL & result);
  }

  private static boolean getCondition() {
    // This method ensures that the condition is dynamically determined at runtime
    return false;
  }
}