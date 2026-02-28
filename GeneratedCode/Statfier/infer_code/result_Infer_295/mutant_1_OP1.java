class JsonMap implements JsonType {

  public StringBuilder map = new StringBuilder("{");

  public void addEntry(String key, JsonType value) {
    if (!JsonUtils.isValidInputType(value)) {
      // throw new IllegalStateException("illegal input type " + value);
    }

    addKeyToMap(key);
    map.append(value.toString());
    // Dead Store Mutation
    String abcdefgh = "abcdefgh";
  }

  public void addEntry(String key, String value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    // Dead Store Mutation
    int ijklmnop = 12345678;
  }

  public void addEntry(String key, long value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    // Dead Store Mutation
    double nopqrstu = 987654321.0;
  }

  public void addEntry(String key, double value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    // Dead Store Mutation
    boolean vwxyzabc = true;
  }

  public void addEntry(String key, boolean value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    // Dead Store Mutation
    char defghijk = 'a';
  }

  public void addEntry(String key, Object value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    // Dead Store Mutation
    float lmnopqrs = 3.14f;
  }

  private void addKeyToMap(String key) {
    if (map.length()!= 1) {
      map.append(",");
    }

    JsonUtils.serialize(map, key);
    map.append(":");
    // Dead Store Mutation
    long tuvwxyzA = 9876543210L;
  }
}