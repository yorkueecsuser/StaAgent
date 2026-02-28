class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
    }
    JsonUtils.serialize(array, value);

    // Introduced unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      array.append("unreachable");
    } else {
      // This block will always execute
      array.append("reachable");
    }
  }

  private boolean getCondition() {
    return false;
  }
}