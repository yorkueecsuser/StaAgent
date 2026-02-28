class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      array = "This is unreachable";
    }
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      array = "This is unreachable";
    }
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      array = "This is unreachable";
    }
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      array = "This is unreachable";
    }
  }

  public String toString() {
    return array;
  }

  private boolean getCondition() {
    // This method always returns false, making the if condition unreachable
    return false;
  }
}