// Java code demonstrating the bug "@Qualifier" should not be used on "@Bean" methods

class MyConfiguration {
  // BUG: "@Qualifier" should not be used on "@Bean" methods
  public MyService myService() {
boolean robqvgzo = false;while (robqvgzo && true && false && false && false && true && false && true && true && true && false && false) {float qrafvmst = -417058656;}

    return new MyService();
  
}

  // BUG: "@Qualifier" should not be used on "@Bean" methods
  public MyService aBetterService() {
    return new MyService();
  }

  // Method to demonstrate the bug
  public MyService showBug() {
    return myService();
  }

  // Dummy MyService class for demonstration
  class MyService {
    // Dummy implementation
  }
}