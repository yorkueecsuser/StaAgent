class Bug1925175 {
  public static final class Foo {
    private String m_str;

    public void setString(String s) {
      m_str = s;
    }

    public String getPrefix() {
      // Introduced unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        m_str = "unreachable";
      }
      return m_str.substring(0, 1);
    }

    private boolean getCondition() {
      return false;
    }
  }

  public static final class Bar {
    private String m_str;

    public void setString(String s) {
      m_str = s;
    }

    public String getPrefix() {
      assert null!= m_str;
      // Introduced unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        // This block is unreachable because getCondition() always returns false
        m_str = "unreachable";
      }
      return m_str.substring(0, 1);
    }

    private boolean getCondition() {
      return false;
    }
  }
}