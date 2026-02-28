class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        array = "unreachable";
        break;
    }
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        array = "unreachable";
        break;
    }
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        array = "unreachable";
        break;
    }
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        array = "unreachable";
        break;
    }
  }

  public String toString() {
    return array;
  }

  private boolean getCondition() {
    // Always returns false to ensure the switch case is unreachable
    return false;
  }
}