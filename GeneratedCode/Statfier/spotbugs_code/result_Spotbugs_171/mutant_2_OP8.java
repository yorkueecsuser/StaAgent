class Bug1925175 {
  public static final class Foo {
    private String m_str;

    public void setString(String s) {
      m_str = s;
    }

    public String getPrefix() {
      return m_str.substring(0, 1);
    }

    // Mutated code
    private String x;

    public void a(String y) {
      x = y;
    }

    public String b() {
      return x.substring(0, 1);
    }
  }

  public static final class Bar {
    private String m_str;

    public void setString(String s) {
      m_str = s;
    }

    public String getPrefix() {
      assert null!= m_str;
      return m_str.substring(0, 1);
    }

    // Mutated code
    private String z;

    public void c(String w) {
      z = w;
    }

    public String d() {
      assert null!= z;
      return z.substring(0, 1);
    }
  }
}