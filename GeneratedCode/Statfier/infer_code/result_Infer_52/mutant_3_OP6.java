class StringTest {

  String mId;

  int indexof_linear(String m) {
    return m.indexOf('_');
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  int indexof_from_linear(String m, int j) {
    return m.indexOf('_', j);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  int indexof_quadratic(String m, String n) {
    return m.indexOf(n);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  int indexof_constant(String n) {
    String m = "hi";
    return m.indexOf('i');
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  public String index_substring_linear() {
    int index = indexof_linear(mId);
    return mId.substring(0, index);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  private String startsWith_constant() {
    String s = "";
    return s.startsWith(",")? s.substring(1) : s;
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void split_linear(String s) {
    String[] list = s.split(",");
    for (int i = 0; i < list.length; i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void split_with_limit_linear(String s, int limit) {
    String[] list = s.split(",", limit);
    for (int i = 0; i < list.length; i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void call_split_constant() {
    String s = new String("hello");
    split_linear(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void byte_array_constructor_linear(byte[] data) {
    String s = new String(data);
    for (int i = 0; i < s.length(); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void call_string_constant() {
    byte[] data = new byte[10];
    byte_array_constructor_linear(data);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void string_constructor_constant() {
    String s = "abcd";
    String str = new String(s);
    for (int i = 0; i < str.length(); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void string_constructor_linear(String s) {
    String str = new String(s);
    for (int i = 0; i < str.length(); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void call_string_constructor_constant() {
    String s = new String();
    string_constructor_linear(s);
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  public void substring_no_end_linear(String s, int x) {
    String sub = s.substring(x);
    for (int i = 0; i < sub.length(); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  public void substring_linear(String s, int x, int y) {
    String sub = s.substring(x, y);
    for (int i = 0; i < sub.length(); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  public void replace_linear(String s) {
    String r = s.replace('.', '/');
    for (int i = 0; i < r.length(); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  public void last_index_of_linear(String s) {
    int j = s.lastIndexOf('/');
    for (int i = 0; i < j; i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void class_get_canonical_name_constant(Integer a) {
    for (int i = 0; i < a.getClass().getCanonicalName().length(); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void string_valueOf_linear(char[] input) {
    String s = String.valueOf(input);
    for (int i = 0; i < s.length(); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  void string_valueOf_constant() {
    char[] input = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    String s = String.valueOf(input);
    for (int i = 0; i < s.length(); i++) {}
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {} // Unreachable for loop
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined
  }
}