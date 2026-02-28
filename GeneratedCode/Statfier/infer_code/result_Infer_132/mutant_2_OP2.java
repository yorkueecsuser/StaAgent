class JsonString implements JsonType {

  public String array;

  public JsonString(String input) {
    array = JsonUtils.serialize(input).toString();
    // Mutant: Duplicating the assignment statement
    array = JsonUtils.serialize(input).toString();
  }

  public JsonString(long input) {
    array = JsonUtils.serialize(input);
    // Mutant: Duplicating the assignment statement
    array = JsonUtils.serialize(input);
  }

  public JsonString(double input) {
    array = JsonUtils.serialize(input);
    // Mutant: Duplicating the assignment statement
    array = JsonUtils.serialize(input);
  }

  public JsonString(boolean input) {
    array = JsonUtils.serialize(input);
    // Mutant: Duplicating the assignment statement
    array = JsonUtils.serialize(input);
  }

  public String toString() {
    return array;
  }
}