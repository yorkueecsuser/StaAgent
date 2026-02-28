class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      array = "Unreachable";
    }
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      array = "Unreachable";
    }
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      array = "Unreachable";
    }
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement
      array = "Unreachable";
    }
  }

  public String toString() {
    return array;
  }

  private boolean getCondition() {
    // This method returns false, making the if statement unreachable
    return false;
  }
}