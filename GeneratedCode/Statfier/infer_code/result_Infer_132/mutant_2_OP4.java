class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      array = "Unreachable Code";
    } else {
      // Alternative unreachable code
      array = "Alternative Unreachable Code";
    }
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      array = "Unreachable Code";
    } else {
      // Alternative unreachable code
      array = "Alternative Unreachable Code";
    }
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      array = "Unreachable Code";
    } else {
      // Alternative unreachable code
      array = "Alternative Unreachable Code";
    }
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      array = "Unreachable Code";
    } else {
      // Alternative unreachable code
      array = "Alternative Unreachable Code";
    }
  }

  public String toString() {
    return array;
  }

  private boolean getCondition() {
    // This method should return a condition that is always false at runtime
    return false;
  }
}