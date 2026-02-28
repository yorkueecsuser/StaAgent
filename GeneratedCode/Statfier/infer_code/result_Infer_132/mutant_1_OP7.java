class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public String toString() {
    return array;
  }

  private boolean getCondition() {
    return false;
  }
}