class MyThread extends Thread { // Noncompliant
  private String deadStore = "abcdefgh"; // Mutation code
  public void doSomething() {
    System.out.println("Hello, World!");
  }
}