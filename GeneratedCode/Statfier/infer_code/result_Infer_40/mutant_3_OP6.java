class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
    }
    JsonUtils.serialize(array, value);

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() will return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}