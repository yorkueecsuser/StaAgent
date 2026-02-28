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
      // Some code that won't be executed due to condition being false
      System.out.println("This is unreachable code.");
    } else {
      // This is the actual path taken
      return s.endsWith(s);
    }
  }

  @ExpectWarning("SA")
  public boolean checkEndsWith() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't be executed due to condition being false
      System.out.println("This is unreachable code.");
    } else {
      // This is the actual path taken
      return a.endsWith(a);
    }
  }

  @ExpectWarning("SA")
  public static boolean checkStartsWith(String s, String t) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't be executed due to condition being false
      System.out.println("This is unreachable code.");
    } else {
      // This is the actual path taken
      return s.startsWith(s);
    }
  }

  @ExpectWarning("SA")
  public boolean checkStartsWith() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't be executed due to condition being false
      System.out.println("This is unreachable code.");
    } else {
      // This is the actual path taken
      return a.startsWith(a);
    }
  }

  @ExpectWarning("SA")
  public static boolean checkContains(String s, String t) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't be executed due to condition being false
      System.out.println("This is unreachable code.");
    } else {
      // This is the actual path taken
      return s.contains(s);
    }
  }

  @ExpectWarning("SA")
  public boolean checkContains() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't be executed due to condition being false
      System.out.println("This is unreachable code.");
    } else {
      // This is the actual path taken
      return a.contains(a);
    }
  }

  @ExpectWarning("SA")
  public static boolean checkEqualsIgnoreCase(String s, String t) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't be executed due to condition being false
      System.out.println("This is unreachable code.");
    } else {
      // This is the actual path taken
      return s.equalsIgnoreCase(s);
    }
  }

  @ExpectWarning("SA")
  public boolean checkEqualsIgnoreCase() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't be executed due to condition being false
      System.out.println("This is unreachable code.");
    } else {
      // This is the actual path taken
      return a.equalsIgnoreCase(a);
    }
  }

  @ExpectWarning("SA")
  public static int checkCompareToIgnoreCase(String s, String t) {
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't be executed due to condition being false
      System.out.println("This is unreachable code.");
      return 0;
    } else {
      // This is the actual path taken
      return s.compareToIgnoreCase(s);
    }
  }

  @ExpectWarning("SA")
  public int checkCompareToIgnoreCase() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that won't be executed due to condition being false
      System.out.println("This is unreachable code.");
      return 0;
    } else {
      // This is the actual path taken
      return a.compareToIgnoreCase(a);
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}