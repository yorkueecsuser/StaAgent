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
  int indexof_linear(String a) {
    return a.indexOf('_');
  }

  int indexof_from_linear(String a, int b) {
    return a.indexOf('_', b);
  }

  int indexof_quadratic(String a, String c) {
    return a.indexOf(c);
  }

  int indexof_constant(String d) {
    String e = "hi";
    return e.indexOf('i');
  }

  public String index_substring_linear() {
    int f = indexof_linear(mId);
    return mId.substring(0, f);
  }

  private String startsWith_constant() {
    String g = "";
    return g.startsWith(",")? g.substring(1) : g;
  }

  void split_linear(String h) {
    String[] k = h.split(",");
    for (int l = 0; l < k.length; l++) {}
  }

  void split_with_limit_linear(String h, int m) {
    String[] n = h.split(",", m);
    for (int o = 0; o < n.length; o++) {}
  }

  void call_split_constant() {
    String p = new String("hello");
    split_linear(p);
  }

  void byte_array_constructor_linear(byte[] q) {
    String r = new String(q);
    for (int s = 0; s < r.length(); s++) {}
  }

  void call_string_constant() {
    byte[] t = new byte[10];
    byte_array_constructor_linear(t);
  }

  void string_constructor_constant() {
    String u = "abcd";
    String v = new String(u);
    for (int w = 0; w < v.length(); w++) {}
  }

  void string_constructor_linear(String x) {
    String y = new String(x);
    for (int z = 0; z < y.length(); z++) {}
  }

  void call_string_constructor_constant() {
    String a = new String();
    string_constructor_linear(a);
  }

  public void substring_no_end_linear(String b, int c) {
    String d = b.substring(c);
    for (int e = 0; e < d.length(); e++) {}
  }

  public void substring_linear(String f, int g, int h) {
    String i = f.substring(g, h);
    for (int j = 0; j < i.length(); j++) {}
  }

  public void replace_linear(String k) {
    String l = k.replace('.', '/');
    for (int m = 0; m < l.length(); m++) {}
  }

  public void last_index_of_linear(String n) {
    int o = n.lastIndexOf('/');
    for (int p = 0; p < o; p++) {}
  }

  boolean unknown_bool_mutant;

  public void last_index_of_linear_FN(String q) {
    int r = q.lastIndexOf('/');
    while (r > 0) {
      int s = q.lastIndexOf('/', r - 1);
      if (s > 0) {
        break;
      }
      r = s;
    }
  }

  void class_get_canonical_name_constant(Integer t) {
    for (int u = 0; u < t.getClass().getCanonicalName().length(); u++) {}
  }

  void string_valueOf_linear(char[] v) {
    String w = String.valueOf(v);
    for (int x = 0; x < w.length(); x++) {}
  }

  void string_valueOf_constant() {
    char[] y = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    String z = String.valueOf(y);
    for (int a = 0; a < z.length(); a++) {}
  }
}