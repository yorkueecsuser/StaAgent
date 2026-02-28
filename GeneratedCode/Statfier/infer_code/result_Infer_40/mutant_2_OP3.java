class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
    }
    JsonUtils.serialize(array, value);

    // Unreachable if statement mutation
    boolean condition = getUnreachableCondition();
    if (condition) {
      array.append("This will never be reached");
    }
  }

  private boolean getUnreachableCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}