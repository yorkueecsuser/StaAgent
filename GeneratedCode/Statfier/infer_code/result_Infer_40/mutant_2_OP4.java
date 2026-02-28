class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
    }
    JsonUtils.serialize(array, value);

    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
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