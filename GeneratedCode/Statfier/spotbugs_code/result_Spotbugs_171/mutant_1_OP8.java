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
    private String a;

    public void b(String c) {
      a = c;
    }

    public String d() {
      return a.substring(0, 1);
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
    private String e;

    public void f(String g) {
      e = g;
    }

    public String h() {
      assert null!= e;
      return e.substring(0, 1);
    }
  }
}