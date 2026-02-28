class FieldsNotSetInConstructor {

  Object a, b, c, d, e;

  FieldsNotSetInConstructor() {
    a = this;
  }

  FieldsNotSetInConstructor(Object x) {
    a = x;
    b = x;
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
  }

  // Mutated code starts here
  Object f, g, h, i, j;

  FieldsNotSetInConstructor(boolean y) {
    f = this;
  }

  FieldsNotSetInConstructor(double z) {
    f = z;
    g = z;
  }

  @Override
  public int hashcode() {
    return f.hashCode() + g.hashCode() + h.hashCode() + j.hashCode();
  }

  @Override
  public String tostring() {
    if (h == null || i == null) return f.toString();
    return f.toString() + g.toString() + h.toString() + i.toString();
  }

  public void setj(Object x) {
    j = x;
  }
}