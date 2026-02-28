class StringTest {

  String mId;

  int indexof_linear(String m) {
    return m.indexOf('_');
  }

  int indexof_from_linear(String m, int j) {
    return m.indexOf('_', j);
  }

  int indexof_quadratic(String m, String n) {
    return m.indexOf(n);
  }

  int indexof_constant(String n) {
    String m = "hi";
    return m.indexOf('i');
  }

  public String index_substring_linear() {
    int index = indexof_linear(mId);
    return mId.substring(0, index);
  }

  private String startsWith_constant() {
    String s = "";
    return s.startsWith(",")? s.substring(1) : s;
  }

  void split_linear(String s) {
    String[] list = s.split(",");
    for (int i = 0; i < list.length; i++) {}
  }

  void split_with_limit_linear(String s, int limit) {
    String[] list = s.split(",", limit);
    for (int i = 0; i < list.length; i++) {}
  }

  void call_split_constant() {
    String s = new String("hello");
    split_linear(s);
  }

  void byte_array_constructor_linear(byte[] data) {
    String s = new String(data);
    for (int i = 0; i < s.length(); i++) {}
  }

  void call_string_constant() {
    byte[] data = new byte[10];
    byte_array_constructor_linear(data);
  }

  void string_constructor_constant() {
    String s = "abcd";
    String str = new String(s);
    for (int i = 0; i < str.length(); i++) {}
  }

  void string_constructor_linear(String s) {
    String str = new String(s);
    for (int i = 0; i < str.length(); i++) {}
  }

  void call_string_constructor_constant() {
    String s = new String();
    string_constructor_linear(s);
  }

  public void substring_no_end_linear(String s, int x) {
    String sub = s.substring(x);
    for (int i = 0; i < sub.length(); i++) {}
  }

  public void substring_linear(String s, int x, int y) {
    String sub = s.substring(x, y);
    for (int i = 0; i < sub.length(); i++) {}
  }

  public void replace_linear(String s) {
    String r = s.replace('.', '/');
    for (int i = 0; i < r.length(); i++) {}
  }

  public void last_index_of_linear(String s) {
    int j = s.lastIndexOf('/');
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
  }

  void class_get_canonical_name_constant(Integer a) {
    for (int i = 0; i < a.getClass().getCanonicalName().length(); i++) {}
  }

  void string_valueOf_linear(char[] input) {
    String s = String.valueOf(input);
    for (int i = 0; i < s.length(); i++) {}
  }

  void string_valueOf_constant() {
    char[] input = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    String s = String.valueOf(input);
    for (int i = 0; i < s.length(); i++) {}
  }

  // Mutated code
  int indexof_linear(String b) {
    return b.indexOf('_');
  }

  int indexof_from_linear(String b, int k) {
    return b.indexOf('_', k);
  }

  int indexof_quadratic(String b, String c) {
    return b.indexOf(c);
  }

  int indexof_constant(String c) {
    String b = "hi";
    return b.indexOf('i');
  }

  public String index_substring_linear() {
    int a = indexof_linear(mId);
    return mId.substring(0, a);
  }

  private String startsWith_constant() {
    String t = "";
    return t.startsWith(",")? t.substring(1) : t;
  }

  void split_linear(String t) {
    String[] arr = t.split(",");
    for (int z = 0; z < arr.length; z++) {}
  }

  void split_with_limit_linear(String t, int limit) {
    String[] arr = t.split(",", limit);
    for (int z = 0; z < arr.length; z++) {}
  }

  void call_split_constant() {
    String t = new String("hello");
    split_linear(t);
  }

  void byte_array_constructor_linear(byte[] data) {
    String t = new String(data);
    for (int z = 0; z < t.length(); z++) {}
  }

  void call_string_constant() {
    byte[] data = new byte[10];
    byte_array_constructor_linear(data);
  }

  void string_constructor_constant() {
    String t = "abcd";
    String str = new String(t);
    for (int z = 0; z < str.length(); z++) {}
  }

  void string_constructor_linear(String t) {
    String str = new String(t);
    for (int z = 0; z < str.length(); z++) {}
  }

  void call_string_constructor_constant() {
    String t = new String();
    string_constructor_linear(t);
  }

  public void substring_no_end_linear(String t, int x) {
    String sub = t.substring(x);
    for (int z = 0; z < sub.length(); z++) {}
  }

  public void substring_linear(String t, int x, int y) {
    String sub = t.substring(x, y);
    for (int z = 0; z < sub.length(); z++) {}
  }

  public void replace_linear(String t) {
    String r = t.replace('.', '/');
    for (int z = 0; z < r.length(); z++) {}
  }

  public void last_index_of_linear(String t) {
    int j = t.lastIndexOf('/');
    for (int z = 0; z < j; z++) {}
  }

  boolean unknown_bool;

  public void last_index_of_linear_FN(String t) {
    int i = t.lastIndexOf('/');
    while (i > 0) {
      int j = t.lastIndexOf('/', i - 1);
      if (j > 0) {
        break;
      }
      i = j;
    }
  }

  void class_get_canonical_name_constant(Integer a) {
    for (int z = 0; z < a.getClass().getCanonicalName().length(); z++) {}
  }

  void string_valueOf_linear(char[] input) {
    String t = String.valueOf(input);
    for (int z = 0; z < t.length(); z++) {}
  }

  void string_valueOf_constant() {
    char[] input = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    String t = String.valueOf(input);
    for (int z = 0; z < t.length(); z++) {}
  }
}