class Bug1925175 {
  public static final class Foo {
    private String m_str;

    public void setString(String s) {
      m_str = s;
    }

    public String getPrefix() {
      // Inserting an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
      return m_str.substring(0, 1);
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is always false, making the loop unreachable
    }
  }

  public static final class Bar {
    private String m_str;

    public void setString(String s) {
      m_str = s;
    }

    public String getPrefix() {
      assert null!= m_str;
      // Inserting an unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable
      }
      return m_str.substring(0, 1);
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is always false, making the loop unreachable
    }
  }
}