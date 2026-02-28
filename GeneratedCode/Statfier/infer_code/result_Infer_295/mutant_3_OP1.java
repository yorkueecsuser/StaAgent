class JsonMap implements JsonType {

  public StringBuilder map = new StringBuilder("{");

  public void addEntry(String key, JsonType value) {
    if (!JsonUtils.isValidInputType(value)) {
      // throw new IllegalStateException("illegal input type " + value);
    }

    addKeyToMap(key);
    map.append(value.toString());
    String qvbnrhty = "unusedVariable"; // Dead Store mutation
  }

  public void addEntry(String key, String value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    int xwvfrtgb = 42; // Dead Store mutation
  }

  public void addEntry(String key, long value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    boolean njhgtvfr = true; // Dead Store mutation
  }

  public void addEntry(String key, double value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    double ytrhgfvb = 3.14; // Dead Store mutation
  }

  public void addEntry(String key, boolean value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    char vbnrhtyg = 'a'; // Dead Store mutation
  }

  public void addEntry(String key, Object value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    long wertgbhn = 123456789L; // Dead Store mutation
  }

  private void addKeyToMap(String key) {
    if (map.length()!= 1) {
      map.append(",");
    }

    JsonUtils.serialize(map, key);
    map.append(":");
    float zxcvbnmr = 0.0f; // Dead Store mutation
  }
}