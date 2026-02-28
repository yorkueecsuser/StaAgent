class Issue744 {

  public double testParsingBad3(String value) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case in testParsingBad3");
        break;
    }
    return new Double(value).doubleValue();
  }

  public double testParsingBad3a(String value) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case in testParsingBad3a");
        break;
    }
    return Double.valueOf(value).doubleValue();
  }

  public double testParsingGood3(String value) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case in testParsingGood3");
        break;
    }
    return Double.parseDouble(value);
  }

  public float testParsingBad4(String value) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case in testParsingBad4");
        break;
    }
    return new Float(value).floatValue();
  }

  public float testParsingBad4a(String value) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case in testParsingBad4a");
        break;
    }
    return Float.valueOf(value).floatValue();
  }

  public float testParsingGood4(String value) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case in testParsingGood4");
        break;
    }
    return Float.parseFloat(value);
  }

  private boolean getCondition() {
    return false;
  }
}