class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
    }
    // Dead Store Mutation
    String qwertyui = "unusedVariable";
    JsonUtils.serialize(array, value);
  }
}