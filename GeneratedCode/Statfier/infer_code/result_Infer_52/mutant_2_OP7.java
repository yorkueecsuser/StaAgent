class StringTest {

  String mId;

  int indexof_linear(String m) {
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    return m.indexOf('_');
  }

  int indexof_from_linear(String m, int j) {
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    return m.indexOf('_', j);
  }

  int indexof_quadratic(String m, String n) {
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    return m.indexOf(n);
  }

  int indexof_constant(String n) {
    String m = "hi";
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    return m.indexOf('i');
  }

  public String index_substring_linear() {
    int index = indexof_linear(mId);
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    return mId.substring(0, index);
  }

  private String startsWith_constant() {
    String s = "";
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    return s.startsWith(",")? s.substring(1) : s;
  }

  void split_linear(String s) {
    String[] list = s.split(",");
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    for (int i = 0; i < list.length; i++) {}
  }

  void split_with_limit_linear(String s, int limit) {
    String[] list = s.split(",", limit);
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    for (int i = 0; i < list.length; i++) {}
  }

  void call_split_constant() {
    String s = new String("hello");
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    split_linear(s);
  }

  void byte_array_constructor_linear(byte[] data) {
    String s = new String(data);
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    for (int i = 0; i < s.length(); i++) {}
  }

  void call_string_constant() {
    byte[] data = new byte[10];
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    byte_array_constructor_linear(data);
  }

  void string_constructor_constant() {
    String s = "abcd";
    String str = new String(s);
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    for (int i = 0; i < str.length(); i++) {}
  }

  void string_constructor_linear(String s) {
    String str = new String(s);
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    for (int i = 0; i < str.length(); i++) {}
  }

  void call_string_constructor_constant() {
    String s = new String();
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    string_constructor_linear(s);
  }

  public void substring_no_end_linear(String s, int x) {
    String sub = s.substring(x);
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    for (int i = 0; i < sub.length(); i++) {}
  }

  public void substring_linear(String s, int x, int y) {
    String sub = s.substring(x, y);
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    for (int i = 0; i < sub.length(); i++) {}
  }

  public void replace_linear(String s) {
    String r = s.replace('.', '/');
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    for (int i = 0; i < r.length(); i++) {}
  }

  public void last_index_of_linear(String s) {
    int j = s.lastIndexOf('/');
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    for (int i = 0; i < j; i++) {}
  }

  boolean unknown_bool;

  public void last_index_of_linear_FN(String s) {
    int i = s.lastIndexOf('/');
    while (i > 0) {
      int j = s.lastIndexOf('/', i - 1);
      if (j > 0) {
        break;
      }
      i = j;
    }
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
  }

  void class_get_canonical_name_constant(Integer a) {
    for (int i = 0; i < a.getClass().getCanonicalName().length(); i++) {}
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
  }

  void string_valueOf_linear(char[] input) {
    String s = String.valueOf(input);
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    for (int i = 0; i < s.length(); i++) {}
  }

  void string_valueOf_constant() {
    char[] input = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    String s = String.valueOf(input);
    boolean conditionWhile = unknown_bool; // Using a non-final variable to avoid unreachable code
    while (conditionWhile) { // Unreachable while loop
      conditionWhile = false; // Ensure the loop becomes false after one iteration if true
    }
    for (int i = 0; i < s.length(); i++) {}
  }
}