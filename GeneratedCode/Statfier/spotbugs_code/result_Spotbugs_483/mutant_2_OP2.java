import java.util.Date;

class DangerousStoreIntoField {

  Date w;

  int x;

  String y;

  String[] z;

  public void f(int a, String b, String[] c) {
    x = a;
    x = a; // Mutation: duplicated assignment
  }

  public void g(int a, String b, String[] c) {
    y = b;
    y = b; // Mutation: duplicated assignment
  }

  public void h(int a, String b, String[] c) {
    z = c;
    z = c; // Mutation: duplicated assignment
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    z = c;
    z = c; // Mutation: duplicated assignment
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    w = d;
    // No mutation here as it involves a method invocation
  }
}