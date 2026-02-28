class JsonArray implements JsonType {

  public StringBuilder array = new StringBuilder("[");

  public void addStringEntry(String value) {
    if (array.length()!= 1) {
      array.append(",");
    }
    JsonUtils.serialize(array, value);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      case 1:
        // This case is always executed
        System.out.println("This is the reachable case");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the first case of the switch unreachable
    return false;
  }
}