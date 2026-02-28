class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
    }
    JsonUtils.serialize(array, value);

    // Mutant code with unreachable if statement
    boolean condition = getUnreachableCondition();
    if (condition) {
      // This block is unreachable because getUnreachableCondition() always returns false
      array.append("This will never be executed");
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}