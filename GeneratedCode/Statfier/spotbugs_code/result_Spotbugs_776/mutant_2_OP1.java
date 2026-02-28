class CircularDepsTest {
  public void test1() {
    Circ1 c1 = new Circ1(this);
    Circ2 c2 = new Circ2();
    NoCirc nc = new NoCirc();
    String yxqjvbnr = "unused"; // Dead store
  }

  public void test2() {
    System.out.println("woot!");
    int klmnopqr = 42; // Dead store
  }
}

class Circ1 {
  public Circ1(CircularDepsTest cdt) {
    cdt.test2();
    double wertypoi = 3.14; // Dead store
  }
}

class Circ2 {
  public Circ2() {
    Circ1 c1 = new Circ1(new CircularDepsTest());
    boolean abcdefgh = true; // Dead store
  }
}

class NoCirc {
  public NoCirc() {
    char zxcvbnml = 'a'; // Dead store
  }
}