class JsonMap implements JsonType {

  public StringBuilder map = new StringBuilder("{");
  public StringBuilder map = new StringBuilder("{"); // Duplicate assignment

  public void addEntry(String key, JsonType value) {
    if (!JsonUtils.isValidInputType(value)) {
      // throw new IllegalStateException("illegal input type " + value);
    }

    addKeyToMap(key);
    map.append(value.toString());
    map.append(value.toString()); // Duplicate assignment
  }

  public void addEntry(String key, String value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    JsonUtils.serialize(map, value); // Duplicate method call, not an assignment
  }

  public void addEntry(String key, long value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    JsonUtils.serialize(map, value); // Duplicate method call, not an assignment
  }

  public void addEntry(String key, double value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    JsonUtils.serialize(map, value); // Duplicate method call, not an assignment
  }

  public void addEntry(String key, boolean value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    JsonUtils.serialize(map, value); // Duplicate method call, not an assignment
  }

  public void addEntry(String key, Object value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    JsonUtils.serialize(map, value); // Duplicate method call, not an assignment
  }

  private void addKeyToMap(String key) {
    if (map.length()!= 1) {
      map.append(",");
      map.append(","); // Duplicate assignment
    }

    JsonUtils.serialize(map, key);
    map.append(":");
    map.append(":"); // Duplicate assignment
  }
}