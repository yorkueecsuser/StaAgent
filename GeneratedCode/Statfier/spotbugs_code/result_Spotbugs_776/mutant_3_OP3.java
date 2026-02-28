class CircularDepsTest {
  public void test1() {
    Circ1 c1 = new Circ1(this);
    Circ2 c2 = new Circ2();
    NoCirc nc = new NoCirc();

    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in test1.");
    }
  }

  public void test2() {
    System.out.println("woot!");

    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in test2.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class Circ1 {
  public Circ1(CircularDepsTest cdt) {
    cdt.test2();

    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in Circ1 constructor.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class Circ2 {
  public Circ2() {
    Circ1 c1 = new Circ1(new CircularDepsTest());

    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in Circ2 constructor.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class NoCirc {
  public NoCirc() {
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in NoCirc constructor.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}