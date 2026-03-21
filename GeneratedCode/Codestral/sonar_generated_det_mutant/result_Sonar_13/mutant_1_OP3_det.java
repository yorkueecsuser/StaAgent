// Java code demonstrating the bug "@Qualifier" should not be used on "@Bean" methods

class MyConfiguration {
  // BUG: "@Qualifier" should not be used on "@Bean" methods
  public MyService myService() {
if (false && false && false && true && true && false && false && false && true && true && false) {double fivujdbe = 226567727;}

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