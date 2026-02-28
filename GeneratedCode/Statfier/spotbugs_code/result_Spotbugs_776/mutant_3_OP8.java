class CircularDepsTest {
  public void test1() {
    Circ1 c1 = new Circ1(this);
    Circ2 c2 = new Circ2();
    NoCirc nc = new NoCirc();
    // Mutant: Renaming 'c1' to 'a'
    Circ1 a = new Circ1(this);
    // Mutant: Renaming 'c2' to 'b'
    Circ2 b = new Circ2();
    // Mutant: Renaming 'nc' to 'c'
    NoCirc c = new NoCirc();
  }

  public void test2() {
    System.out.println("woot!");
    // Mutant: Renaming 'this' to 'd'
    CircularDepsTest d = this;
    d.test2();
  }
}

class Circ1 {
  public Circ1(CircularDepsTest cdt) {
    cdt.test2();
    // Mutant: Renaming 'cdt' to 'e'
    CircularDepsTest e = cdt;
    e.test2();
  }
}

class Circ2 {
  public Circ2() {
    Circ1 c1 = new Circ1(new CircularDepsTest());
    // Mutant: Renaming 'c1' to 'f'
    Circ1 f = new Circ1(new CircularDepsTest());
  }
}

class NoCirc {
  public NoCirc() {}
  // Mutant: Adding a new method with renamed variable
  public void someMethod() {
    NoCirc g = new NoCirc();
  }
}