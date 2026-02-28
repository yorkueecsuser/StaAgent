class Issue744 {

  public double testParsingBad3(String value) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return new Double(value).doubleValue();
  }

  public double testParsingBad3a(String value) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return Double.valueOf(value).doubleValue();
  }

  public double testParsingGood3(String value) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return Double.parseDouble(value);
  }

  public float testParsingBad4(String value) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return new Float(value).floatValue();
  }

  public float testParsingBad4a(String value) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return Float.valueOf(value).floatValue();
  }

  public float testParsingGood4(String value) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
    return Float.parseFloat(value);
  }

  private boolean getCondition() {
    return false;
  }
}