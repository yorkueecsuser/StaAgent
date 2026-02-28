import java.util.Hashtable;

class Ideas_2010_01_11 {

  static Hashtable<String, String> h = new Hashtable<String, String>();

  static String get(String k) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return h.get(k);
  }

  static String get2(String k) {
    String result;
    try {
      result = h.get(k);
    } catch (Exception e) {
      result = "unknown2";
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return result;
  }

  static String get3(String k) {
    String result;
    try {
      result = h.get(k);
    } catch (RuntimeException e) {
      result = "unknown3";
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return result;
  }

  static String get4(String k) {
    String result;
    try {
      result = h.get(k);
    } catch (NullPointerException e) {
      result = "unknown4";
    }
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
    return result;
  }

  public static void main(String args[]) {
    System.out.println(get2(null));
    System.out.println(get3(null));
    System.out.println(get4(null));
  }

  static boolean getCondition() {
    return false;
  }
}