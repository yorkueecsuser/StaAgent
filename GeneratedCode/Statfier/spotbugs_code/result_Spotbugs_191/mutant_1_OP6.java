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
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
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
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
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
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable
    }
    return result;
  }

  private static boolean getCondition() {
    return false;
  }

  public static void main(String args[]) {
    System.out.println(get2(null));
    System.out.println(get3(null));
    System.out.println(get4(null));
  }
}