class Bug1925175 {
  public static final class Foo {
    private String m_str;

    public void setString(String s) {
      m_str = s;
    }

    public String getPrefix() {
      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        m_str = "unreachable";
      }
      return m_str.substring(0, 1);
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }

  public static final class Bar {
    private String m_str;

    public void setString(String s) {
      m_str = s;
    }

    public String getPrefix() {
      assert null!= m_str;
      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        m_str = "unreachable";
      }
      return m_str.substring(0, 1);
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined but always false
    }
  }
}