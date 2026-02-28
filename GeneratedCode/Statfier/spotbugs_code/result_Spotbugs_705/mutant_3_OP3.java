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
    return s.endsWith(s);
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  @ExpectWarning("SA")
  public boolean checkEndsWith() {
    return a.endsWith(a);
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  @ExpectWarning("SA")
  public static boolean checkStartsWith(String s, String t) {
    return s.startsWith(s);
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  @ExpectWarning("SA")
  public boolean checkStartsWith() {
    return a.startsWith(a);
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  @ExpectWarning("SA")
  public static boolean checkContains(String s, String t) {
    return s.contains(s);
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  @ExpectWarning("SA")
  public boolean checkContains() {
    return a.contains(a);
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  @ExpectWarning("SA")
  public static boolean checkEqualsIgnoreCase(String s, String t) {
    return s.equalsIgnoreCase(s);
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  @ExpectWarning("SA")
  public boolean checkEqualsIgnoreCase() {
    return a.equalsIgnoreCase(a);
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  @ExpectWarning("SA")
  public static int checkCompareToIgnoreCase(String s, String t) {
    return s.compareToIgnoreCase(s);
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  @ExpectWarning("SA")
  public int checkCompareToIgnoreCase() {
    return a.compareToIgnoreCase(a);
    // Mutant: Inserting unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement.");
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}