class CircularDepsTest {
  public void test1() {
    Circ1 c1 = new Circ1(this);
    Circ1 c1_duplicate = new Circ1(this); // Duplicate assignment
    Circ2 c2 = new Circ2();
    Circ2 c2_duplicate = new Circ2(); // Duplicate assignment
    NoCirc nc = new NoCirc();
    NoCirc nc_duplicate = new NoCirc(); // Duplicate assignment
  }

  public void test2() {
    System.out.println("woot!");
  }
}

class Circ1 {
  public Circ1(CircularDepsTest cdt) {
    cdt.test2();
  }
}

class Circ2 {
  public Circ2() {
    Circ1 c1 = new Circ1(new CircularDepsTest());
    Circ1 c1_duplicate = new Circ1(new CircularDepsTest()); // Duplicate assignment
  }
}

class NoCirc {
  public NoCirc() {}
}