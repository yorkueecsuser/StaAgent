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
    m = "hi"; // Mutation: Duplicate assignment
    return m.indexOf('i');
  }

  public String index_substring_linear() {
    int index = indexof_linear(mId);
    index = indexof_linear(mId); // Mutation: Duplicate assignment
    return mId.substring(0, index);
  }

  private String startsWith_constant() {
    String s = "";
    s = ""; // Mutation: Duplicate assignment
    return s.startsWith(",")? s.substring(1) : s;
  }

  void split_linear(String s) {
    String[] list = s.split(",");
    list = s.split(","); // Mutation: Duplicate assignment
    for (int i = 0; i < list.length; i++) {}
  }

  void split_with_limit_linear(String s, int limit) {
    String[] list = s.split(",", limit);
    list = s.split(",", limit); // Mutation: Duplicate assignment
    for (int i = 0; i < list.length; i++) {}
  }

  void call_split_constant() {
    String s = new String("hello");
    s = new String("hello"); // Mutation: Duplicate assignment
    split_linear(s);
  }

  void byte_array_constructor_linear(byte[] data) {
    String s = new String(data);
    s = new String(data); // Mutation: Duplicate assignment
    for (int i = 0; i < s.length(); i++) {}
  }

  void call_string_constant() {
    byte[] data = new byte[10];
    data = new byte[10]; // Mutation: Duplicate assignment
    byte_array_constructor_linear(data);
  }

  void string_constructor_constant() {
    String s = "abcd";
    s = "abcd"; // Mutation: Duplicate assignment
    String str = new String(s);
    str = new String(s); // Mutation: Duplicate assignment
    for (int i = 0; i < str.length(); i++) {}
  }

  void string_constructor_linear(String s) {
    String str = new String(s);
    str = new String(s); // Mutation: Duplicate assignment
    for (int i = 0; i < str.length(); i++) {}
  }

  void call_string_constructor_constant() {
    String s = new String();
    s = new String(); // Mutation: Duplicate assignment
    string_constructor_linear(s);
  }

  public void substring_no_end_linear(String s, int x) {
    String sub = s.substring(x);
    sub = s.substring(x); // Mutation: Duplicate assignment
    for (int i = 0; i < sub.length(); i++) {}
  }

  public void substring_linear(String s, int x, int y) {
    String sub = s.substring(x, y);
    sub = s.substring(x, y); // Mutation: Duplicate assignment
    for (int i = 0; i < sub.length(); i++) {}
  }

  public void replace_linear(String s) {
    String r = s.replace('.', '/');
    r = s.replace('.', '/'); // Mutation: Duplicate assignment
    for (int i = 0; i < r.length(); i++) {}
  }

  public void last_index_of_linear(String s) {
    int j = s.lastIndexOf('/');
    j = s.lastIndexOf('/'); // Mutation: Duplicate assignment
    for (int i = 0; i < j; i++) {}
  }

  boolean unknown_bool;

  public void last_index_of_linear_FN(String s) {
    int i = s.lastIndexOf('/');
    i = s.lastIndexOf('/'); // Mutation: Duplicate assignment
    while (i > 0) {
      int j = s.lastIndexOf('/', i - 1);
      j = s.lastIndexOf('/', i - 1); // Mutation: Duplicate assignment
      if (j > 0) {
        break;
      }
      i = j;
      i = j; // Mutation: Duplicate assignment
    }
  }

  void class_get_canonical_name_constant(Integer a) {
    for (int i = 0; i < a.getClass().getCanonicalName().length(); i++) {}
  }

  void string_valueOf_linear(char[] input) {
    String s = String.valueOf(input);
    s = String.valueOf(input); // Mutation: Duplicate assignment
    for (int i = 0; i < s.length(); i++) {}
  }

  void string_valueOf_constant() {
    char[] input = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    input = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'}; // Mutation: Duplicate assignment
    String s = String.valueOf(input);
    s = String.valueOf(input); // Mutation: Duplicate assignment
    for (int i = 0; i < s.length(); i++) {}
  }
}