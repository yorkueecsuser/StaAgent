class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
    }
    JsonUtils.serialize(array, value);

    // Introduced unreachable if statement according to the mutation operator
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      array.append("UNREACHABLE");
    }
  }

  private boolean getCondition() {
    return false;
  }
}