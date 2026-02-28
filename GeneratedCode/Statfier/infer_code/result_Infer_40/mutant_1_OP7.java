class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
    }
    JsonUtils.serialize(array, value);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is intended to be unreachable
    }
  }

  private boolean getCondition() {
    return false;
  }
}