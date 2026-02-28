import java.util.Hashtable;

class Ideas_2010_01_11 {

  static Hashtable<String, String> h = new Hashtable<String, String>();

  static String get(String k) {
    return h.get(k);
  }

  static String get2(String k) {
    String result;
    try {
      result = h.get(k);
    } catch (Exception e) {
      result = "unknown2";
    }
    return result;
  }

  static String get3(String k) {
    String x; // Mutated variable name from'result' to 'x'
    try {
      x = h.get(k);
    } catch (RuntimeException e) {
      x = "unknown3";
    }
    return x;
  }

  static String get4(String k) {
    String y; // Mutated variable name from'result' to 'y'
    try {
      y = h.get(k);
    } catch (NullPointerException e) {
      y = "unknown4";
    }
    return y;
  }

  public static void main(String args[]) {
    System.out.println(get2(null));
    System.out.println(get3(null));
    System.out.println(get4(null));
  }
}