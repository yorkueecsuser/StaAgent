class Issue744 {

  public double testParsingBad3(String value) {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case");
        break;
    }
    return new Double(value).doubleValue();
  }

  public double testParsingBad3a(String value) {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case");
        break;
    }
    return Double.valueOf(value).doubleValue();
  }

  public double testParsingGood3(String value) {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case");
        break;
    }
    return Double.parseDouble(value);
  }

  public float testParsingBad4(String value) {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case");
        break;
    }
    return new Float(value).floatValue();
  }

  public float testParsingBad4a(String value) {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case");
        break;
    }
    return Float.valueOf(value).floatValue();
  }

  public float testParsingGood4(String value) {
    boolean condition = getCondition();
    switch(condition) {
      case true: // This case will never be reached because condition is not set to true
        System.out.println("This is an unreachable case");
        break;
    }
    return Float.parseFloat(value);
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is always false
  }
}