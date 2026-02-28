class Issue744 {

  public double testParsingBad3(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 0.0;
    } else {
      // Unreachable code
      return -1.0;
    }
    return new Double(value).doubleValue();
  }

  public double testParsingBad3a(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 0.0;
    } else {
      // Unreachable code
      return -1.0;
    }
    return Double.valueOf(value).doubleValue();
  }

  public double testParsingGood3(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 0.0;
    } else {
      // Unreachable code
      return -1.0;
    }
    return Double.parseDouble(value);
  }

  public float testParsingBad4(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 0.0f;
    } else {
      // Unreachable code
      return -1.0f;
    }
    return new Float(value).floatValue();
  }

  public float testParsingBad4a(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 0.0f;
    } else {
      // Unreachable code
      return -1.0f;
    }
    return Float.valueOf(value).floatValue();
  }

  public float testParsingGood4(String value) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return 0.0f;
    } else {
      // Unreachable code
      return -1.0f;
    }
    return Float.parseFloat(value);
  }

  private boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}