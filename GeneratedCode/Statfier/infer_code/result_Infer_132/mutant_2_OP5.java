class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        array = "unreachable";
        break;
      default:
        // Default case
        break;
    }
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        array = "unreachable";
        break;
      default:
        // Default case
        break;
    }
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        array = "unreachable";
        break;
      default:
        // Default case
        break;
    }
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        array = "unreachable";
        break;
      default:
        // Default case
        break;
    }
  }

  public String toString() {
    return array;
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}