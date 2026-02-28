class Bug1864046 {
  public String m_field1, m_field2, m_field3;

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((m_field1 == null)? 0 : m_field1.hashCode());
    result = prime * result + ((m_field2 == null)? 0 : m_field2.hashCode());
    result = prime * result + ((m_field3 == null)? 0 : m_field3.hashCode());
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
    return true;
  }

  // Mutated code
  public String a, b, c;

  @Override
  public int hashCode() {
    final int x = 31;
    int y = 1;
    y = x * y + ((a == null)? 0 : a.hashCode());
    y = x * y + ((b == null)? 0 : b.hashCode());
    y = x * y + ((c == null)? 0 : c.hashCode());
    return y;
  }

  @Override
  public boolean equals(Object z) {
    if (this == z) return true;
    if (z == null) return false;
    if (getClass()!= z.getClass()) return false;
    final Bug1864046 w = (Bug1864046) z;
    if (a == null) {
      if (w.a!= null) return false;
    } else if (!a.equals(w.a)) return false;
    if (b == null) {
      if (w.b!= null) return false;
    } else if (!b.equals(w.b)) return false;
    if (c == null) {
      if (w.c!= null) return false;
    } else if (!c.equals(w.c)) return false;
    return true;
  }
}