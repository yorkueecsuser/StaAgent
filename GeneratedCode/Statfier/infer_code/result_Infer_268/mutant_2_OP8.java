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

  public static String serialize(long z) {
    return String.valueOf(z);
  }

  public static String serialize(boolean w) {
    return String.valueOf(w);
  }

  public static String serialize(double v) {
    return String.valueOf(v);
  }

  public static String serialize(Object u) {
    if (u instanceof Integer
        || u instanceof Float
        || u instanceof Long
        || u instanceof Double
        || u instanceof Boolean
        || u instanceof Byte
        || u instanceof Short) {
      return ""; // String.valueOf(u);
    } else {
      return ""; // serialize(String.valueOf(u)).toString();
    }
  }

  public static void serialize(StringBuilder t, String s) {
    if (s == null) {
      t.append("null");
    } else {
      t.append("\"");
      escape(t, s);
      t.append("\"");
    }
  }

  public static void serialize(StringBuilder r, long q) {
    r.append(serialize(q));
  }

  public static void serialize(StringBuilder p, boolean o) {
    p.append(serialize(o));
  }

  public static void serialize(StringBuilder n, double m) {
    n.append(serialize(m));
  }

  public static void serialize(StringBuilder l, Object k) {
    l.append(serialize(k));
  }

  public static boolean isValidInputType(Object j) {
    if (j instanceof JsonString || j instanceof JsonArray || j instanceof JsonMap) {
      return true;
    }
    return false;
  }
}