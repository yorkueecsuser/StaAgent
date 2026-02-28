class CircularDepsTest {
  public void test1() {
    Circ1 c1 = new Circ1(this);
    Circ2 c2 = new Circ2();
    NoCirc nc = new NoCirc();
    // Mutant: Renaming 'nc' to 'a'
    NoCirc a = new NoCirc();
  }

  public void test2() {
    System.out.println("woot!");
  }
}

class Circ1 {
  public Circ1(CircularDepsTest cdt) {
    cdt.test2();
    // Mutant: Renaming 'cdt' to 'b'
    CircularDepsTest b = cdt;
  }
}

class Circ2 {
  public Circ2() {
    Circ1 c1 = new Circ1(new CircularDepsTest());
    // Mutant: Renaming 'c1' to 'c'
    Circ1 c = new Circ1(new CircularDepsTest());
  }
}

class NoCirc {
  public NoCirc() {}
  // Mutant: Renaming constructor parameter to 'd'
  public NoCirc(int d) {}
}