import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2013_03_15 {

  String a, b;

  public String getA() {
    return a;
  }

  public String getB() {
    return b;
  }

  private Ideas_2013_03_15(String a, String b) {
    this.a = a;
    this.b = b;
  }

  @ExpectWarning("SA")
  public static boolean checkEndsWith(String s, String t) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Some alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return s.endsWith(s);
  }

  @ExpectWarning("SA")
  public boolean checkEndsWith() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Some alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return a.endsWith(a);
  }

  @ExpectWarning("SA")
  public static boolean checkStartsWith(String s, String t) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Some alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return s.startsWith(s);
  }

  @ExpectWarning("SA")
  public boolean checkStartsWith() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Some alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return a.startsWith(a);
  }

  @ExpectWarning("SA")
  public static boolean checkContains(String s, String t) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Some alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return s.contains(s);
  }

  @ExpectWarning("SA")
  public boolean checkContains() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Some alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return a.contains(a);
  }

  @ExpectWarning("SA")
  public static boolean checkEqualsIgnoreCase(String s, String t) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Some alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return s.equalsIgnoreCase(s);
  }

  @ExpectWarning("SA")
  public boolean checkEqualsIgnoreCase() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Some alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return a.equalsIgnoreCase(a);
  }

  @ExpectWarning("SA")
  public static int checkCompareToIgnoreCase(String s, String t) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Some alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return s.compareToIgnoreCase(s);
  }

  @ExpectWarning("SA")
  public int checkCompareToIgnoreCase() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code");
    } else {
      // Some alternative unreachable code
      System.out.println("This is also unreachable code");
    }
    return a.compareToIgnoreCase(a);
  }

  private static boolean getCondition() {
    return false; // This method will always return false, making the if-else branches unreachable
  }
}