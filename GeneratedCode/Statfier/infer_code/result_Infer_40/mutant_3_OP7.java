class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
    }
    JsonUtils.serialize(array, value);

    // Unreachable while loop mutant
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // This loop is unreachable because getUnreachableCondition() always returns false
    }
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}