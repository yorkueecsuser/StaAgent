import edu.umd.cs.findbugs.annotations.Confidence;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

class Bug3571969 {

  String r;

  public static void main(String[] args) {
    Bug3571969 test = new Bug3571969();
    String s = args[0] + args[1];
    test.r = s;
    System.out.println(test.test1a(s));
    System.out.println(test.test2a(s));
    System.out.println(test.test3a(s));
    System.out.println(test.test4a(s));
    System.out.println(test.test1b());
    System.out.println(test.test2b());
    System.out.println(test.test3b());
    System.out.println(test.test4b());
    System.out.println(test.test1c());
    System.out.println(test.test2c());
    System.out.println(test.test3c());
    System.out.println(test.test4c());
  }

  @NoWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  @ExpectWarning(value = "ES_COMPARING_PARAMETER_STRING_WITH_EQ", confidence = Confidence.MEDIUM)
  public boolean test1a(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test1a");
    }
    return s == "test";
  }

  @NoWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  @ExpectWarning(value = "ES_COMPARING_PARAMETER_STRING_WITH_EQ", confidence = Confidence.MEDIUM)
  public boolean test2a(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test2a");
    }
    return "test" == s;
  }

  @NoWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  @ExpectWarning(value = "ES_COMPARING_PARAMETER_STRING_WITH_EQ", confidence = Confidence.MEDIUM)
  public boolean test3a(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test3a");
    }
    return "test"!= s;
  }

  @NoWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  @ExpectWarning(value = "ES_COMPARING_PARAMETER_STRING_WITH_EQ", confidence = Confidence.MEDIUM)
  public boolean test4a(String s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test4a");
    }
    return s!= "test";
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test1b() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test1b");
    }
    return r == "test";
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test2b() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test2b");
    }
    return "test" == r;
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test3b() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test3b");
    }
    return "test"!= r;
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test4b() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test4b");
    }
    return r!= "test";
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test1c() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test1c");
    }
    if (r == "test") r = "a";
    return true;
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  boolean test2c() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test2c");
    }
    if (r!= "test") r = "a";
    return true;
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test3c() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test3c");
    }
    if ("test"!= r) r = "a";
    return true;
  }

  @ExpectWarning(value = "ES_COMPARING_STRINGS_WITH_EQ", confidence = Confidence.LOW)
  public boolean test4c() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement in test4c");
    }
    if (r!= "test") r = "a";
    return true;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if statements unreachable
  }
}