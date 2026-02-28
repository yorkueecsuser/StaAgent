class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      array = "Unreachable Code";
    } else {
      // Alternative code
      array = input;
    }
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      array = "Unreachable Code";
    } else {
      // Alternative code
      array = String.valueOf(input);
    }
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      array = "Unreachable Code";
    } else {
      // Alternative code
      array = String.valueOf(input);
    }
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      array = "Unreachable Code";
    } else {
      // Alternative code
      array = String.valueOf(input);
    }
  }

  public String toString() {
    return array;
  }

  private boolean getCondition() {
    // This method returns false, making the if-block unreachable
    return false;
  }
}