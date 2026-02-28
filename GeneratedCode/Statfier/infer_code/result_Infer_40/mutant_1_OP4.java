class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
    }
    JsonUtils.serialize(array, value);

    // Mutant code: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      array.append("This is unreachable");
    } else {
      // This block will always execute
      array.append("This is reachable");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures that the condition is dynamically determined but always returns false
  }
}