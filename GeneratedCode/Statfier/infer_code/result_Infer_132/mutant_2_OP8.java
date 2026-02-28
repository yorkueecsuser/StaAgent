class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    String b = JsonUtils.serialize(input).toString(); // Mutant: Renamed 'array' to 'b'
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    long c = JsonUtils.serialize(input); // Mutant: Renamed 'array' to 'c'
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    double d = JsonUtils.serialize(input); // Mutant: Renamed 'array' to 'd'
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    boolean e = JsonUtils.serialize(input); // Mutant: Renamed 'array' to 'e'
  }

  public String toString() {
    return array;
  }
}