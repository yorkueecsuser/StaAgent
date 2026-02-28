class CircularDepsTest {
  public void test1() {
    Circ1 c1 = new Circ1(this);
    Circ2 c2 = new Circ2();
    NoCirc nc = new NoCirc();
    String qvbnrhty = "unused"; // Dead Store
  }

  public void test2() {
    System.out.println("woot!");
    int xjfnrhty = 42; // Dead Store
  }
}

class Circ1 {
  public Circ1(CircularDepsTest cdt) {
    cdt.test2();
    boolean vbnrhtyq = true; // Dead Store
  }
}

class Circ2 {
  public Circ2() {
    Circ1 c1 = new Circ1(new CircularDepsTest());
    double jfnrhtyx = 3.14; // Dead Store
  }
}

class NoCirc {
  public NoCirc() {
    char htrbvqfn = 'a'; // Dead Store
  }
}