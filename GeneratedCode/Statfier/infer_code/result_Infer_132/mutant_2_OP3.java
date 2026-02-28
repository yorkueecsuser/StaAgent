class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      array = "Unreachable";
    }
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      array = "Unreachable";
    }
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      array = "Unreachable";
    }
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      array = "Unreachable";
    }
  }

  public String toString() {
    return array;
  }

  private boolean getCondition() {
    // This method ensures that the condition is not a compile-time constant
    return false;
  }
}