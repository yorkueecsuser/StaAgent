class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    // Dead Store Mutation
    String qvbnrhty = "unusedVariable";
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    // Dead Store Mutation
    int xwvfrtgb = 42;
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    // Dead Store Mutation
    boolean njmklpoi = true;
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    // Dead Store Mutation
    double asdfghjk = 3.14;
  }

  public String toString() {
    return array;
  }
}