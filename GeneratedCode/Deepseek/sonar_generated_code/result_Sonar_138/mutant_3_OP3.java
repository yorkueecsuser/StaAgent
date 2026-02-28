class MyThread extends Thread { 
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  public void unreachableIfStatement() {
    if (false) {
      // This code will never be executed
      // But it is still required to avoid unreachable statement error
      // So we add an arbitrary statement here
      int a = 1; 
    }
  }
}