class FieldsNotSetInConstructor {

  Object a, b, c, d, e;

  FieldsNotSetInConstructor() {
    a = this;
    a = this; // Mutant: duplicated assignment
  }

  FieldsNotSetInConstructor(Object x) {
    a = x;
    a = x; // Mutant: duplicated assignment
    b = x;
    b = x; // Mutant: duplicated assignment
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
    e = x; // Mutant: duplicated assignment
  }
}