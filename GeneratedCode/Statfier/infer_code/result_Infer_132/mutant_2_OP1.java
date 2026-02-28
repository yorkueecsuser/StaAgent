class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    // Dead store mutation
    String qwertyui = "unusedVariable";
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    // Dead store mutation
    int asdfghjk = 42;
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    // Dead store mutation
    boolean zxcvbnml = true;
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    // Dead store mutation
    double poiuytrewq = 3.14;
  }

  public String toString() {
    return array;
  }
}