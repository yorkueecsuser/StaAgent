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
    int i = 0;
    do {
    } while (++i < list.length);
  }

  void split_with_limit_linear(String s, int limit) {
    String[] list = s.split(",", limit);
    int i = 0;
    do {
    } while (++i < list.length);
  }

  void call_split_constant() {
    String s = new String("hello");
    split_linear(s);
  }

  void byte_array_constructor_linear(byte[] data) {
    String s = new String(data);
    int i = 0;
    do {
    } while (++i < s.length());
  }

  void call_string_constant() {
    byte[] data = new byte[10];
    byte_array_constructor_linear(data);
  }

  void string_constructor_constant() {
    String s = "abcd";
    String str = new String(s);
    int i = 0;
    do {
    } while (++i < str.length());
  }

  void string_constructor_linear(String s) {
    String str = new String(s);
    int i = 0;
    do {
    } while (++i < str.length());
  }

  void call_string_constructor_constant() {
    String s = new String();
    string_constructor_linear(s);
  }

  public void substring_no_end_linear(String s, int x) {
    String sub = s.substring(x);
    int i = 0;
    do {
    } while (++i < sub.length());
  }

  public void substring_linear(String s, int x, int y) {
    String sub = s.substring(x, y);
    int i = 0;
    do {
    } while (++i < sub.length());
  }

  public void replace_linear(String s) {
    String r = s.replace('.', '/');
    int i = 0;
    do {
    } while (++i < r.length());
  }

  public void last_index_of_linear(String s) {
    int j = s.lastIndexOf('/');
    int i = 0;
    do {
    } while (++i < j);
  }

  boolean unknown_bool;

  public void last_index_of_linear_FN(String s) {
    int i = s.lastIndexOf('/');
    do {
      int j = s.lastIndexOf('/', i - 1);
      if (j > 0) {
        break;
      }
      i = j;
    } while (i > 0);
  }

  void class_get_canonical_name_constant(Integer a) {
    int i = 0;
    do {
    } while (++i < a.getClass().getCanonicalName().length());
  }

  void string_valueOf_linear(char[] input) {
    String s = String.valueOf(input);
    int i = 0;
    do {
    } while (++i < s.length());
  }

  void string_valueOf_constant() {
    char[] input = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    String s = String.valueOf(input);
    int i = 0;
    do {
    } while (++i < s.length());
  }
}