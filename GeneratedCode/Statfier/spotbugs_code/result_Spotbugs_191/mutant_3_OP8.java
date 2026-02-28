import java.util.Hashtable;

class Ideas_2010_01_11 {

  static Hashtable<String, String> h = new Hashtable<String, String>();

  static String get(String k) {
    return h.get(k);
  }

  static String get2(String k) {
    String x; // Mutated variable name from'result' to 'x'
    try {
      x = h.get(k);
    } catch (Exception e) {
      x = "unknown2";
    }
    return x;
  }

  static String get3(String k) {
    String y; // Mutated variable name from'result' to 'y'
    try {
      y = h.get(k);
    } catch (RuntimeException e) {
      y = "unknown3";
    }
    return y;
  }

  static String get4(String k) {
    String z; // Mutated variable name from'result' to 'z'
    try {
      z = h.get(k);
    } catch (NullPointerException e) {
      z = "unknown4";
    }
    return z;
  }

  public static void main(String args[]) {
    System.out.println(get2(null));
    System.out.println(get3(null));
    System.out.println(get4(null));
  }
}