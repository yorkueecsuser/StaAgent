class FieldsNotSetInConstructor {

  Object a, b, c, d, e;

  FieldsNotSetInConstructor() {
    a = this;
    // Dead store mutation
    String qwertyui = "unused";
  }

  FieldsNotSetInConstructor(Object x) {
    a = x;
    b = x;
    // Dead store mutation
    int asdfghjk = 42;
  }

  @Override
  public int hashCode() {
    return a.hashCode() + b.hashCode() + c.hashCode() + e.hashCode();
    // Dead store mutation
    boolean zxcvbnml = true;
  }

  @Override
  public String toString() {
    if (c == null || d == null) return a.toString();
    return a.toString() + b.toString() + c.toString() + d.toString();
    // Dead store mutation
    double hjklpoiuyt = 3.14;
  }

  public void setE(Object x) {
    e = x;
    // Dead store mutation
    char mnbvcxz = 'a';
  }
}