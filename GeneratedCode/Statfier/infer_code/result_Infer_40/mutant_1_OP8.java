class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
    }
    JsonUtils.serialize(array, value);
  }

  // Mutated code
  public StringBuilder b = new StringBuilder("[");

  public void addStringEntry(String v) {
    if (b.length()!= 1) {
      b.append(",");
    }
    JsonUtils.serialize(b, v);
  }
}