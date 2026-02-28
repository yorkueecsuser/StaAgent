class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    // Mutant: Renaming 'array' to 'b'
    String b = JsonUtils.serialize(input).toString();
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    // Mutant: Renaming 'array' to 'c'
    String c = JsonUtils.serialize(input);
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    // Mutant: Renaming 'array' to 'd'
    String d = JsonUtils.serialize(input);
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    // Mutant: Renaming 'array' to 'e'
    String e = JsonUtils.serialize(input);
  }

  public String toString() {
    return array;
  }
}