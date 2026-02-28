class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
  }
}

class MutatedMyThread extends Thread {
  private boolean shouldRun = getCondition();

  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void mutatedDoSomething() {
    while (shouldRun) {
      switch (getValue()) {
        case 1:
          System.out.println("Mutated Hello, World!");
          break;
        default:
          System.out.println("This should not be reached");
          break;
      }
    }
  }

  private int getValue() {
    return 1;
  }

  private boolean getCondition() {
    return false;
  }
}