class Bug1925175 {
  public static final class Foo {
    private String m_str;

    public void setString(String s) {
      m_str = s;
      // Dead store mutation
      String qwerasdf = "unused";
    }

    public String getPrefix() {
      return m_str.substring(0, 1);
    }
  }

  public static final class Bar {
    private String m_str;

    public void setString(String s) {
      m_str = s;
      // Dead store mutation
      int zxvbnmjk = 42;
    }

    public String getPrefix() {
      assert null!= m_str;
      return m_str.substring(0, 1);
    }
  }
}