class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
  }
}

class MyMutantThread extends Thread { // Renaming MyThread to MyMutantThread
  public void doSomething() {
    System.out.println("Hello, World!");
  }
}