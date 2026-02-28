class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void unreachableSwitch() {
    switch(0) {
      case 1:
        System.out.println("This is an unreachable statement");
        break;
      case 2:
        System.out.println("This is another unreachable statement");
        break;
      // Add more cases as needed
    }
  }
}