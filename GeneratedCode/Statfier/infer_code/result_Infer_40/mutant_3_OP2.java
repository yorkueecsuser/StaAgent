class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
      array.append(","); // Mutant: duplicated the append statement
    }
    JsonUtils.serialize(array, value);
  }
}