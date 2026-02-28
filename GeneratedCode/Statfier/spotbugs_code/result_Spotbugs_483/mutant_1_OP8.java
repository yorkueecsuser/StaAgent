import java.util.Date;

class DangerousStoreIntoField {

  Date w;

  int x;

  String y;

  String[] z;

  public void f(int a, String b, String[] c) {
    x = a;
    int q = a; // Mutant: Renamed 'x' to 'q'
  }

  public void g(int a, String b, String[] c) {
    y = b;
    String r = b; // Mutant: Renamed 'y' to 'r'
  }

  public void h(int a, String b, String[] c) {
    z = c;
    String[] s = c; // Mutant: Renamed 'z' to's'
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    z = c;
    String[] t = c; // Mutant: Renamed 'z' to 't'
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    w = d;
    Date u = d; // Mutant: Renamed 'w' to 'u'
  }
}