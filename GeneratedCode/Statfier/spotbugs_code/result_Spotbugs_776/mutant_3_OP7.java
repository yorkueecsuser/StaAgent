class CircularDepsTest {
  public void test1() {
    Circ1 c1 = new Circ1(this);
    Circ2 c2 = new Circ2();
    NoCirc nc = new NoCirc();
    
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  public void test2() {
    System.out.println("woot!");
    
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class Circ1 {
  public Circ1(CircularDepsTest cdt) {
    cdt.test2();
    
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class Circ2 {
  public Circ2() {
    Circ1 c1 = new Circ1(new CircularDepsTest());
    
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class NoCirc {
  public NoCirc() {
    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}