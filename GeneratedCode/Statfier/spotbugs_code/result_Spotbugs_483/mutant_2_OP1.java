import java.util.Date;

class DangerousStoreIntoField {

  Date w;

  int x;

  String y;

  String[] z;

  public void f(int a, String b, String[] c) {
    x = a;
    // Dead Store Mutation
    int abcdefgh = 42;
  }

  public void g(int a, String b, String[] c) {
    y = b;
    // Dead Store Mutation
    String ijklmnop = "unused";
  }

  public void h(int a, String b, String[] c) {
    z = c;
    // Dead Store Mutation
    double qrstuvwx = 3.14;
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    z = c;
    // Dead Store Mutation
    boolean yzabcdef = true;
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    w = d;
    // Dead Store Mutation
    char ghijklmn = 'x';
  }
}