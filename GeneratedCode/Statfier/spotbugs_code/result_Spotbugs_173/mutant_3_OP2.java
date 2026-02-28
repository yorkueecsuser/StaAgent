class FieldsNotSetInConstructor {

  Object a, b, c, d, e;

  FieldsNotSetInConstructor() {
    a = this;
    a = this; // Mutation: Duplicate assignment
  }

  FieldsNotSetInConstructor(Object x) {
    a = x;
    a = x; // Mutation: Duplicate assignment
    b = x;
    b = x; // Mutation: Duplicate assignment
  }

  @Override
  public int hashCode() {
    return a.hashCode() + b.hashCode() + c.hashCode() + e.hashCode();
  }

  @Override
  public String toString() {
    if (c == null || d == null) return a.toString();
    return a.toString() + b.toString() + c.toString() + d.toString();
  }

  public void setE(Object x) {
    e = x;
    e = x; // Mutation: Duplicate assignment
  }
}