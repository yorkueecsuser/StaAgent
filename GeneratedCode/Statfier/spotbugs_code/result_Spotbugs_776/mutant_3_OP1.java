class CircularDepsTest {
  public void test1() {
    Circ1 c1 = new Circ1(this);
    Circ2 c2 = new Circ2();
    NoCirc nc = new NoCirc();
    String jxqfvtzu = "unusedVariable"; // Dead Store mutation
  }

  public void test2() {
    System.out.println("woot!");
    int wvbnrhty = 42; // Dead Store mutation
  }
}

class Circ1 {
  public Circ1(CircularDepsTest cdt) {
    cdt.test2();
    boolean klmnopqr = true; // Dead Store mutation
  }
}

class Circ2 {
  public Circ2() {
    Circ1 c1 = new Circ1(new CircularDepsTest());
    double abcd efgh = 3.14; // Dead Store mutation
  }
}

class NoCirc {
  public NoCirc() {
    char ijklmnop = 'a'; // Dead Store mutation
  }
}