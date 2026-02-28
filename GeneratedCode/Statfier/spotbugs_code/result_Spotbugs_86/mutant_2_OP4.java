class Bug1864046 {
  public String m_field1, m_field2, m_field3;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((m_field1 == null)? 0 : m_field1.hashCode());
    result = prime * result + ((m_field2 == null)? 0 : m_field2.hashCode());
    result = prime * result + ((m_field3 == null)? 0 : m_field3.hashCode());

    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      result = prime * result + 999; // This line will never be executed
    } else {
      result = prime * result + 888; // This line will also never be executed
    }

    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass()!= obj.getClass()) return false;
    final Bug1864046 other = (Bug1864046) obj;
    if (m_field1 == null) {
      if (other.m_field1!= null) return false;
    } else if (!m_field1.equals(other.m_field1)) return false;
    if (m_field2 == null) {
      if (other.m_field2!= null) return false;
    } else if (!m_field2.equals(other.m_field2)) return false;
    if (m_field3 == null) {
      if (other.m_field3!= null) return false;
    } else if (!m_field3.equals(other.m_field3)) return false;

    // Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      return false; // This line will never be executed
    } else {
      return true; // This line will also never be executed
    }

    return true;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, ensuring the branches are unreachable
  }
}