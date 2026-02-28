import java.util.Date;

class DangerousStoreIntoField {

  Date w;
  Date v; // Renamed 'w' to 'v'

  int x;
  int q; // Renamed 'x' to 'q'

  String y;
  String r; // Renamed 'y' to 'r'

  String[] z;
  String[] s; // Renamed 'z' to's'

  public void f(int a, String b, String[] c) {
    x = a;
    q = a; // Mutant: Renamed 'x' to 'q'
  }

  public void g(int a, String b, String[] c) {
    y = b;
    r = b; // Mutant: Renamed 'y' to 'r'
  }

  public void h(int a, String b, String[] c) {
    z = c;
    s = c; // Mutant: Renamed 'z' to's'
  }

  public void i(int a, String b, String[] c) {
    if (c.length == 0) throw new IllegalArgumentException();
    z = c;
    s = c; // Mutant: Renamed 'z' to's'
  }

  public void j(Date d) {
    if (d.before(new Date())) throw new IllegalArgumentException();
    w = d;
    v = d; // Mutant: Renamed 'w' to 'v'
  }
}