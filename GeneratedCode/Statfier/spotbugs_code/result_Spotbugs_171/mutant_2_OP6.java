class Bug1925175 {
  public static final class Foo {
    private String m_str;

    public void setString(String s) {
      m_str = s;
    }

    public String getPrefix() {
      // Inserting unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable code
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
      // Inserting unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // Unreachable code
      }
      return m_str.substring(0, 1);
    }

    private boolean getCondition() {
      return false;
    }
  }
}