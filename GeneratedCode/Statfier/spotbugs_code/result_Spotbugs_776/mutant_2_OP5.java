class CircularDepsTest {
  public void test1() {
    Circ1 c1 = new Circ1(this);
    Circ2 c2 = new Circ2();
    NoCirc nc = new NoCirc();

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  public void test2() {
    System.out.println("woot!");

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch condition is always false, making the switch statement unreachable
  }
}

class Circ1 {
  public Circ1(CircularDepsTest cdt) {
    cdt.test2();

    // Introduced unreachable switch statement
    boolean condition = cdt.getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }
}

class Circ2 {
  public Circ2() {
    Circ1 c1 = new Circ1(new CircularDepsTest());

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch condition is always false, making the switch statement unreachable
  }
}

class NoCirc {
  public NoCirc() {
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        System.out.println("This is unreachable");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This ensures the switch condition is always false, making the switch statement unreachable
  }
}