class JsonMap implements JsonType {

  public StringBuilder map = new StringBuilder("{");

  public void addEntry(String key, JsonType value) {
    if (!JsonUtils.isValidInputType(value)) {
      // throw new IllegalStateException("illegal input type " + value);
    }

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }

    addKeyToMap(key);
    map.append(value.toString());
  }

  public void addEntry(String key, String value) {
    addKeyToMap(key);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }

    JsonUtils.serialize(map, value);
  }

  public void addEntry(String key, long value) {
    addKeyToMap(key);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }

    JsonUtils.serialize(map, value);
  }

  public void addEntry(String key, double value) {
    addKeyToMap(key);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }

    JsonUtils.serialize(map, value);
  }

  public void addEntry(String key, boolean value) {
    addKeyToMap(key);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }

    JsonUtils.serialize(map, value);
  }

  public void addEntry(String key, Object value) {
    addKeyToMap(key);

    // Mutant: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      map.append("unreachable");
    }

    JsonUtils.serialize(map, value);
  }

  private void addKeyToMap(String key) {
    if (map.length()!= 1) {
      map.append(",");

      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        map.append("unreachable");
      }
    }

    JsonUtils.serialize(map, key);
    map.append(":");
  }

  // Method to provide a dynamic condition for the unreachable if statements
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}