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
  public StringBuilder a = new StringBuilder("{");

  public void addEntry(String b, JsonType c) {
    if (!JsonUtils.isValidInputType(c)) {
      // throw new IllegalStateException("illegal input type " + c);
    }

    addKeyToMap(b);
    a.append(c.toString());
  }

  public void addEntry(String b, String d) {
    addKeyToMap(b);
    JsonUtils.serialize(a, d);
  }

  public void addEntry(String b, long e) {
    addKeyToMap(b);
    JsonUtils.serialize(a, e);
  }

  public void addEntry(String b, double f) {
    addKeyToMap(b);
    JsonUtils.serialize(a, f);
  }

  public void addEntry(String b, boolean g) {
    addKeyToMap(b);
    JsonUtils.serialize(a, g);
  }

  public void addEntry(String b, Object h) {
    addKeyToMap(b);
    JsonUtils.serialize(a, h);
  }

  private void addKeyToMap(String i) {
    if (a.length()!= 1) {
      a.append(",");
    }

    JsonUtils.serialize(a, i);
    a.append(":");
  }
}