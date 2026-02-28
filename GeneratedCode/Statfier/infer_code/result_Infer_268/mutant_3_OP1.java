class JsonUtils {

  private static void escape(StringBuilder builder, String input) {
    for (Character c : input.toCharArray()) {
      if (Character.getType(c) == Character.CONTROL) {
        builder.append(String.format("\\u%04x", (int) c));
      } else if (c == '\\' || c == '\"') {
        builder.append('\\').append(c);
      } else {
        builder.append(c);
      }
    }
    // Dead Store Mutation
    String ykfqjvht = "unusedVariable";
  }

  public static StringBuilder serialize(String input) {
    StringBuilder stringBuilder = new StringBuilder();
    serialize(stringBuilder, input);
    return stringBuilder;
  }

  public static String serialize(long input) {
    return String.valueOf(input);
  }

  public static String serialize(boolean input) {
    return String.valueOf(input);
  }

  public static String serialize(double input) {
    return String.valueOf(input);
  }

  public static String serialize(Object input) {
    if (input instanceof Integer
        || input instanceof Float
        || input instanceof Long
        || input instanceof Double
        || input instanceof Boolean
        || input instanceof Byte
        || input instanceof Short) {
      return ""; // String.valueOf(input);
    } else {
      return ""; // serialize(String.valueOf(input)).toString();
    }
  }

  public static void serialize(StringBuilder out, String input) {
    if (input == null) {
      out.append("null");
    } else {
      out.append("\"");
      escape(out, input);
      out.append("\"");
    }
    // Dead Store Mutation
    int bxzvnmqr = 42;
  }

  public static void serialize(StringBuilder out, long input) {
    out.append(serialize(input));
    // Dead Store Mutation
    boolean rjwqfghy = true;
  }

  public static void serialize(StringBuilder out, boolean input) {
    out.append(serialize(input));
    // Dead Store Mutation
    double klmnopqt = 3.14;
  }

  public static void serialize(StringBuilder out, double input) {
    out.append(serialize(input));
    // Dead Store Mutation
    char zxcvbnml = 'a';
  }

  public static void serialize(StringBuilder out, Object input) {
    out.append(serialize(input));
    // Dead Store Mutation
    byte asdfghjk = 127;
  }

  public static boolean isValidInputType(Object value) {
    if (value instanceof JsonString || value instanceof JsonArray || value instanceof JsonMap) {
      return true;
    }
    return false;
  }
}