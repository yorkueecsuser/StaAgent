class JsonMap implements JsonType {

  public StringBuilder map = new StringBuilder("{");

  public void addEntry(String key, JsonType value) {
    if (!JsonUtils.isValidInputType(value)) {
      // throw new IllegalStateException("illegal input type " + value);
    }

    addKeyToMap(key);
    map.append(value.toString());
  }

  public void addEntry(String key, String value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
  }

  public void addEntry(String key, long value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
  }

  public void addEntry(String key, double value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
  }

  public void addEntry(String key, boolean value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
  }

  public void addEntry(String key, Object value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
  }

  private void addKeyToMap(String key) {
    if (map.length()!= 1) {
      map.append(",");
    }

    JsonUtils.serialize(map, key);
    map.append(":");
  }

  // Mutated code
  public StringBuilder x = new StringBuilder("{");

  public void addEntry(String y, JsonType z) {
    if (!JsonUtils.isValidInputType(z)) {
      // throw new IllegalStateException("illegal input type " + z);
    }

    addKeyToMap(y);
    x.append(z.toString());
  }

  public void addEntry(String y, String v) {
    addKeyToMap(y);
    JsonUtils.serialize(x, v);
  }

  public void addEntry(String y, long w) {
    addKeyToMap(y);
    JsonUtils.serialize(x, w);
  }

  public void addEntry(String y, double q) {
    addKeyToMap(y);
    JsonUtils.serialize(x, q);
  }

  public void addEntry(String y, boolean r) {
    addKeyToMap(y);
    JsonUtils.serialize(x, r);
  }

  public void addEntry(String y, Object s) {
    addKeyToMap(y);
    JsonUtils.serialize(x, s);
  }

  private void addKeyToMap(String t) {
    if (x.length()!= 1) {
      x.append(",");
    }

    JsonUtils.serialize(x, t);
    x.append(":");
  }
}