class JsonMap implements JsonType {

  public StringBuilder map = new StringBuilder("{");

  public void addEntry(String key, JsonType value) {
    if (!JsonUtils.isValidInputType(value)) {
      // throw new IllegalStateException("illegal input type " + value);
    }

    addKeyToMap(key);
    map.append(value.toString());
    // Dead Store Mutation
    String jxqfvtbn = "unusedVariable";
  }

  public void addEntry(String key, String value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    // Dead Store Mutation
    int rhtyuiop = 42;
  }

  public void addEntry(String key, long value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    // Dead Store Mutation
    boolean nmjklpoi = true;
  }

  public void addEntry(String key, double value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    // Dead Store Mutation
    char vbnmghjk = 'a';
  }

  public void addEntry(String key, boolean value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    // Dead Store Mutation
    float yuiophgf = 3.14f;
  }

  public void addEntry(String key, Object value) {
    addKeyToMap(key);
    JsonUtils.serialize(map, value);
    // Dead Store Mutation
    double lkjhgfds = 2.718;
  }

  private void addKeyToMap(String key) {
    if (map.length()!= 1) {
      map.append(",");
    }

    JsonUtils.serialize(map, key);
    map.append(":");
    // Dead Store Mutation
    long asdfghjk = 1234567890L;
  }
}