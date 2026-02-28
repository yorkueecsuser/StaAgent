class JsonMap implements JsonType {

  public StringBuilder map = new StringBuilder("{");

  public void addEntry(String key, JsonType value) {
    if (!JsonUtils.isValidInputType(value)) {
      // throw new IllegalStateException("illegal input type " + value);
    }

    addKeyToMap(key);
    map.append(value.toString());

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }
  }

  public void addEntry(String key, String value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }
  }

  public void addEntry(String key, long value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }
  }

  public void addEntry(String key, double value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }
  }

  public void addEntry(String key, boolean value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }
  }

  public void addEntry(String key, Object value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }
  }

  private void addKeyToMap(String key) {
    if (map.length()!= 1) {
      map.append(",");
    }

    JsonUtils.serialize(map, key);
    map.append(":");

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }
  }

  private boolean getCondition() {
    return false;
  }
}