class CircularDepsTest {
  public void test1() {
    Circ1 c1 = new Circ1(this);
    Circ2 c2 = new Circ2();
    NoCirc nc = new NoCirc();
    // Mutant: Renamed 'c1' to 'a'
    Circ1 a = new Circ1(this);
    // Mutant: Renamed 'c2' to 'b'
    Circ2 b = new Circ2();
    // Mutant: Renamed 'nc' to 'c'
    NoCirc c = new NoCirc();
  }

  public void test2() {
    System.out.println("woot!");
    // Mutant: Renamed 'test2' method call parameter 'this' to 'd'
    Circ1 e = new Circ1(d);
  }
  // Mutant: Added a new method to demonstrate renaming within a method
  public void test3() {
    Circ1 f = new Circ1(this);
    Circ2 g = new Circ2();
    NoCirc h = new NoCirc();
  }
}

class Circ1 {
  public Circ1(CircularDepsTest cdt) {
    cdt.test2();
    // Mutant: Renamed 'cdt' to 'i'
    i.test2();
  }
  // Mutant: Added a new constructor to demonstrate renaming within a class
  public Circ1(CircularDepsTest j) {
    j.test2();
  }
}

class Circ2 {
  public Circ2() {
    Circ1 c1 = new Circ1(new CircularDepsTest());
    // Mutant: Renamed 'c1' to 'k'
    Circ1 k = new Circ1(new CircularDepsTest());
  }
  // Mutant: Added a new method to demonstrate renaming within a class
  public void method() {
    Circ1 l = new Circ1(new CircularDepsTest());
  }
}

class NoCirc {
  public NoCirc() {}
  // Mutant: Added a new method to demonstrate renaming within a class
  public void method() {
    NoCirc m = new NoCirc();
  }
}