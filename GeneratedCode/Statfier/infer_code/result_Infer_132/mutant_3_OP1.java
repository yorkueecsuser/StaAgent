class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    String qzjxmwkp = "unusedVariable"; // Dead Store
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    int rhtyfghj = 42; // Dead Store
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    boolean wertyuio = true; // Dead Store
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    double lkjhgfds = 3.14; // Dead Store
  }

  public String toString() {
    return array;
  }
}