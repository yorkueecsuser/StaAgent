class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val; // BUG: Getters and setters should access the expected fields
  }

  public int getY() {
    return this.x; // BUG: Getters and setters should access the expected fields
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }

  // Mutant 1: Unreachable if statement
  public void showBug1() {
    setX(10);
    if (false) {
      System.out.println("This is unreachable code");
    } else {
      System.out.println(getY());
    }
  }

  // Mutant 2: Unreachable while loop
  public void showBug2() {
    setX(10);
    while (false) {
      System.out.println("This is unreachable code");
    }
    System.out.println(getY());
  }

  // Mutant 3: Unreachable for loop
  public void showBug3() {
    setX(10);
    for (int i = 0; false; i++) {
      System.out.println("This is unreachable code");
    }
    System.out.println(getY());
  }

  // Mutant 4: Unreachable if-else statement
  public void showBug4() {
    setX(10);
    if (false) {
      System.out.println("This is unreachable code");
    } else {
      System.out.println(getY());
    }
  }

  // Mutant 5: Unreachable switch statement
  public void showBug5() {
    setX(10);
    int value = 0;
    switch (value) {
      case 1:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println(getY());
        break;
    }
  }
}