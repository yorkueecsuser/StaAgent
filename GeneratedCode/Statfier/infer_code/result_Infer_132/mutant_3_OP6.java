class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
  }

  public String toString() {
    return array;
  }

  private boolean getCondition() {
    return false; // This ensures the loop is unreachable but avoids compile-time constant
  }
}