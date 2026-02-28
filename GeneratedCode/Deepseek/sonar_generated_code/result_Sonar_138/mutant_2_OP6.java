class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
    for (boolean condition = false; condition; ) {
      // Unreachable code here.
      // This code will never be executed due to the condition being always false.
    }
  }
}