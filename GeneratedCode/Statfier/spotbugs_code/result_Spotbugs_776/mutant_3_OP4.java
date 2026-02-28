class CircularDepsTest {
  public void test1() {
    Circ1 c1 = new Circ1(this);
    Circ2 c2 = new Circ2();
    NoCirc nc = new NoCirc();
    
    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  public void test2() {
    System.out.println("woot!");
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
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
    
    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}

class NoCirc {
  public NoCirc() {
    // Added mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will never run");
    } else {
      System.out.println("This will also never run");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}