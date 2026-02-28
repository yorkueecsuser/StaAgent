class Bug1925175 {
  public static final class Foo {
    private String m_str;

    public void setString(String s) {
      m_str = s;
    }

    public String getPrefix() {
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          m_str = "unreachable";
          break;
      }
      return m_str.substring(0, 1);
    }

    private boolean getCondition() {
      // This method always returns false, making the switch condition always evaluate to 1
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
      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case is unreachable because condition is never true
          m_str = "unreachable";
          break;
      }
      return m_str.substring(0, 1);
    }

    private boolean getCondition() {
      // This method always returns false, making the switch condition always evaluate to 1
      return false;
    }
  }
}