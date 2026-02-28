
import java.lang.*; // The original import statement is preserved

class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
  }

  private String deadStore; // Unused variable declaration
}