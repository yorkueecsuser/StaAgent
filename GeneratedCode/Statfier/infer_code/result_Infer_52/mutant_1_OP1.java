class StringTest {

  String mId;

  int indexof_linear(String m) {
    return m.indexOf('_');
    // Dead Store
    String yqjvbnrf = "unused";
  }

  int indexof_from_linear(String m, int j) {
    return m.indexOf('_', j);
    // Dead Store
    int wertghjk = 42;
  }

  int indexof_quadratic(String m, String n) {
    return m.indexOf(n);
    // Dead Store
    double qazwsxed = 3.14;
  }

  int indexof_constant(String n) {
    String m = "hi";
    return m.indexOf('i');
    // Dead Store
    boolean cvbnmghj = true;
  }

  public String index_substring_linear() {
    int index = indexof_linear(mId);
    return mId.substring(0, index);
    // Dead Store
    char tfrdgyuh = 'x';
  }

  private String startsWith_constant() {
    String s = "";
    return s.startsWith(",")? s.substring(1) : s;
    // Dead Store
    float ijklmnop = 2.71f;
  }

  void split_linear(String s) {
    String[] list = s.split(",");
    for (int i = 0; i < list.length; i++) {}
    // Dead Store
    long asdfghjk = 123456789L;
  }

  void split_with_limit_linear(String s, int limit) {
    String[] list = s.split(",", limit);
    for (int i = 0; i < list.length; i++) {}
    // Dead Store
    short zxcvbnml = 123;
  }

  void call_split_constant() {
    String s = new String("hello");
    split_linear(s);
    // Dead Store
    byte qwertyui = 8;
  }

  void byte_array_constructor_linear(byte[] data) {
    String s = new String(data);
    for (int i = 0; i < s.length(); i++) {}
    // Dead Store
    int poiuytrewq = 789;
  }

  void call_string_constant() {
    byte[] data = new byte[10];
    byte_array_constructor_linear(data);
    // Dead Store
    String lkjhgfds = "another unused";
  }

  void string_constructor_constant() {
    String s = "abcd";
    String str = new String(s);
    for (int i = 0; i < str.length(); i++) {}
    // Dead Store
    double mnbvcxz = 0.577;
  }

  void string_constructor_linear(String s) {
    String str = new String(s);
    for (int i = 0; i < str.length(); i++) {}
    // Dead Store
    char poiuhygt = 'y';
  }

  void call_string_constructor_constant() {
    String s = new String();
    string_constructor_linear(s);
    // Dead Store
    boolean edcfvghb = false;
  }

  public void substring_no_end_linear(String s, int x) {
    String sub = s.substring(x);
    for (int i = 0; i < sub.length(); i++) {}
    // Dead Store
    long vbnrtyui = 987654321L;
  }

  public void substring_linear(String s, int x, int y) {
    String sub = s.substring(x, y);
    for (int i = 0; i < sub.length(); i++) {}
    // Dead Store
    short hjklpoiuy = 456;
  }

  public void replace_linear(String s) {
    String r = s.replace('.', '/');
    for (int i = 0; i < r.length(); i++) {}
    // Dead Store
    float asdfghjkl = 1.618f;
  }

  public void last_index_of_linear(String s) {
    int j = s.lastIndexOf('/');
    for (int i = 0; i < j; i++) {}
    // Dead Store
    String zxcvbnmlk = "more unused";
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
    // Dead Store
    double qazwsxedc = 2.718;
  }

  void class_get_canonical_name_constant(Integer a) {
    for (int i = 0; i < a.getClass().getCanonicalName().length(); i++) {}
    // Dead Store
    char rfvtgbhn = 'z';
  }

  void string_valueOf_linear(char[] input) {
    String s = String.valueOf(input);
    for (int i = 0; i < s.length(); i++) {}
    // Dead Store
    int ytrfdcvbn = 6789;
  }

  void string_valueOf_constant() {
    char[] input = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
    String s = String.valueOf(input);
    for (int i = 0; i < s.length(); i++) {}
    // Dead Store
    boolean lkjhgfdsa = true;
  }
}