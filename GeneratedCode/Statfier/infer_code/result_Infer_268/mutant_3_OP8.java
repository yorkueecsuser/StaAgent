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
  }

  public static void serialize(StringBuilder out, long input) {
    out.append(serialize(input));
  }

  public static void serialize(StringBuilder out, boolean input) {
    out.append(serialize(input));
  }

  public static void serialize(StringBuilder out, double input) {
    out.append(serialize(input));
  }

  public static void serialize(StringBuilder out, Object input) {
    out.append(serialize(input));
  }

  public static boolean isValidInputType(Object value) {
    if (value instanceof JsonString || value instanceof JsonArray || value instanceof JsonMap) {
      return true;
    }
    return false;
  }

  // Mutated code
  private static void escape(StringBuilder a, String b) {
    for (Character c : b.toCharArray()) {
      if (Character.getType(c) == Character.CONTROL) {
        a.append(String.format("\\u%04x", (int) c));
      } else if (c == '\\' || c == '\"') {
        a.append('\\').append(c);
      } else {
        a.append(c);
      }
    }
  }

  public static StringBuilder serialize(String x) {
    StringBuilder y = new StringBuilder();
    serialize(y, x);
    return y;
  }

  public static void serialize(StringBuilder z, String w) {
    if (w == null) {
      z.append("null");
    } else {
      z.append("\"");
      escape(z, w);
      z.append("\"");
    }
  }
}