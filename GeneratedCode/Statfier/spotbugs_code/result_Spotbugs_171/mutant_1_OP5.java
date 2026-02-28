class Bug1925175 {
  public static final class Foo {
    private String m_str;

    public void setString(String s) {
      m_str = s;
    }

    public String getPrefix() {
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
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
      boolean condition = getCondition();
      switch(condition) {
        case true:
          // This case is intentionally left empty to make the switch statement unreachable
          break;
      }
      return m_str.substring(0, 1);
    }

    private boolean getCondition() {
      return false;
    }
  }
}