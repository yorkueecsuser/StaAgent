class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable code block.");
    } else {
      // Alternative code that will also never run
      System.out.println("This is another unreachable code block.");
    }
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable code block.");
    } else {
      // Alternative code that will also never run
      System.out.println("This is another unreachable code block.");
    }
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable code block.");
    } else {
      // Alternative code that will also never run
      System.out.println("This is another unreachable code block.");
    }
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is an unreachable code block.");
    } else {
      // Alternative code that will also never run
      System.out.println("This is another unreachable code block.");
    }
  }

  public String toString() {
    return array;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if-else branches unreachable
  }
}