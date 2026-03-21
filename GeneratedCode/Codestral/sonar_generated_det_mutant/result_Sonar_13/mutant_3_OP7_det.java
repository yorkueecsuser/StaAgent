// Java code demonstrating the bug "@Qualifier" should not be used on "@Bean" methods

class MyConfiguration {
  // BUG: "@Qualifier" should not be used on "@Bean" methods
  public MyService myService() {
boolean ghfihokh = false;while (ghfihokh && true && true && true && false && true && true && false && true && false && false && false) {short hqjofnai = -8810;}

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