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
  public StringBuilder q = new StringBuilder("{");

  public void addEntry(String x, JsonType y) {
    if (!JsonUtils.isValidInputType(y)) {
      // throw new IllegalStateException("illegal input type " + y);
    }

    addKeyToMap(x);
    q.append(y.toString());
  }

  public void addEntry(String x, String z) {
    addKeyToMap(x);
    JsonUtils.serialize(q, z);
  }

  public void addEntry(String x, long w) {
    addKeyToMap(x);
    JsonUtils.serialize(q, w);
  }

  public void addEntry(String x, double v) {
    addKeyToMap(x);
    JsonUtils.serialize(q, v);
  }

  public void addEntry(String x, boolean u) {
    addKeyToMap(x);
    JsonUtils.serialize(q, u);
  }

  public void addEntry(String x, Object t) {
    addKeyToMap(x);
    JsonUtils.serialize(q, t);
  }

  private void addKeyToMap(String s) {
    if (q.length()!= 1) {
      q.append(",");
    }

    JsonUtils.serialize(q, s);
    q.append(":");
  }
}