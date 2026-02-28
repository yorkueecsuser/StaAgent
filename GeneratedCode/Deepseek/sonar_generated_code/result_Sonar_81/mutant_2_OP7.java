class MyClass {
  private final Object lock = new Object();

  public void doSomethingSynchronized() {
    synchronized (lock) {  // Mutant: Synchronized on a private, final object
      //...
    }
  }

  public void showBug() {
    boolean condition = false;  // Noncompliant
    if (condition) { // Mutant: Unreachable if statement
      //...
    }

    while (false) { // Mutant: Unreachable while loop
      //...
    }

    for (int i = 0; false; i++) { // Mutant: Unreachable for loop
      //...
    }

    int value = 0;  // Noncompliant
    switch (value) { // Mutant: Unreachable switch statement
      case 1:
        //...
        break;
      default:
        //...
        break;
    }
  }
}