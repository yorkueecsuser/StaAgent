import java.util.Date;

class DangerousStoreIntoField {

  Date w;
  Date t; // Mutant: Renamed 'w' to 't'

  int x;
  int v; // Mutant: Renamed 'x' to 'v'

  String y;
  String s; // Mutant: Renamed 'y' to's'

  String[] z;
  String[] u; // Mutant: Renamed 'z' to 'u'

  public void f(int a, String b, String[] c) {
    x = a;
    v = a; // Mutant: Renamed 'x' to 'v'
  }

  public void g(int a, String b, String[] c) {
    y = b;
    s = b; // Mutant: Renamed 'y' to's'
  }

  public void h(int a, String b, String[] c) {
    z = c;
    u = c; // Mutant: Renamed 'z' to 'u'
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    z = c;
    u = c; // Mutant: Renamed 'z' to 'u'
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    w = d;
    t = d; // Mutant: Renamed 'w' to 't'
  }
}