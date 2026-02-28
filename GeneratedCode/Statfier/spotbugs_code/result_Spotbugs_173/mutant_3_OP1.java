class FieldsNotSetInConstructor {

  Object a, b, c, d, e;

  FieldsNotSetInConstructor() {
    a = this;
    // Dead Store Mutation
    String qyjvbnrt = "unused";
  }

  FieldsNotSetInConstructor(Object x) {
    a = x;
    b = x;
    // Dead Store Mutation
    int kxwzvfpo = 42;
  }

  @Override
  public int hashCode() {
    return a.hashCode() + b.hashCode() + c.hashCode() + e.hashCode();
    // Dead Store Mutation
    boolean jhfnrhty = false;
  }

  @Override
  public String toString() {
    if (c == null || d == null) return a.toString();
    return a.toString() + b.toString() + c.toString() + d.toString();
    // Dead Store Mutation
    double mnbvcxzj = 3.14;
  }

  public void setE(Object x) {
    e = x;
    // Dead Store Mutation
    char lkjhgfds = 'a';
  }
}