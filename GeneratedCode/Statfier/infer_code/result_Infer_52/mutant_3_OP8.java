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

  int indexof_from_linear(String b, int c) {
    return b.indexOf('_', c);
  }

  int indexof_quadratic(String d, String e) {
    return d.indexOf(e);
  }

  int indexof_constant(String f) {
    String g = "hi";
    return g.indexOf('i');
  }

  public String index_substring_linear() {
    int h = indexof_linear(mId);
    return mId.substring(0, h);
  }

  private String startsWith_constant() {
    String k = "";
    return k.startsWith(",")? k.substring(1) : k;
  }

  void split_linear(String l) {
    String[] m = l.split(",");
    for (int n = 0; n < m.length; n++) {}
  }

  void split_with_limit_linear(String o, int p) {
    String[] q = o.split(",", p);
    for (int r = 0; r < q.length; r++) {}
  }

  void call_split_constant() {
    String t = new String("hello");
    split_linear(t);
  }

  void byte_array_constructor_linear(byte[] u) {
    String v = new String(u);
    for (int w = 0; w < v.length(); w++) {}
  }

  void call_string_constant() {
    byte[] x = new byte[10];
    byte_array_constructor_linear(x);
  }

  void string_constructor_constant() {
    String y = "abcd";
    String z = new String(y);
    for (int aa = 0; aa < z.length(); aa++) {}
  }

  void string_constructor_linear(String bb) {
    String cc = new String(bb);
    for (int dd = 0; dd < cc.length(); dd++) {}
  }

  void call_string_constructor_constant() {
    String ee = new String();
    string_constructor_linear(ee);
  }

  public void substring_no_end_linear(String ff, int gg) {
    String hh = ff.substring(gg);
    for (int ii = 0; ii < hh.length(); ii++) {}
  }

  public void substring_linear(String jj, int kk, int ll) {
    String mm = jj.substring(kk, ll);
    for (int nn = 0; nn < mm.length(); nn++) {}
  }

  public void replace_linear(String oo) {
    String pp = oo.replace('.', '/');
    for (int qq = 0; qq < pp.length(); qq++) {}
  }

  public void last_index_of_linear(String rr) {
    int ss = rr.lastIndexOf('/');
    for (int tt = 0; tt < ss; tt++) {}
  }

  boolean unknown_bool_mutant;

  public void last_index_of_linear_FN(String uu) {
    int vv = uu.lastIndexOf('/');
    while (vv > 0) {
      int ww = uu.lastIndexOf('/', vv - 1);
      if (ww > 0) {
        break;
      }
      vv = ww;
    }
  }

  void class_get_canonical_name_constant(Integer xx) {
    for (int yy = 0; yy < xx.getClass().getCanonicalName().length(); yy++) {}
  }

  void string_valueOf_linear(char[] zz) {
    String aaa = String.valueOf(zz);
    for (int bbb = 0; bbb < aaa.length(); bbb++) {}
  }

  void string_valueOf_constant() {
    char[] ccc = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    String ddd = String.valueOf(ccc);
    for (int eee = 0; eee < ddd.length(); eee++) {}
  }
}