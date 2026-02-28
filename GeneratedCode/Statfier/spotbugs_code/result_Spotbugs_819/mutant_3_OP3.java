class Issue744 {

  public double testParsingBad3(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in testParsingBad3");
    }
    return new Double(value).doubleValue();
  }

  public double testParsingBad3a(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in testParsingBad3a");
    }
    return Double.valueOf(value).doubleValue();
  }

  public double testParsingGood3(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in testParsingGood3");
    }
    return Double.parseDouble(value);
  }

  public float testParsingBad4(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in testParsingBad4");
    }
    return new Float(value).floatValue();
  }

  public float testParsingBad4a(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in testParsingBad4a");
    }
    return Float.valueOf(value).floatValue();
  }

  public float testParsingGood4(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement in testParsingGood4");
    }
    return Float.parseFloat(value);
  }

  private boolean getCondition() {
    return false;
  }
}