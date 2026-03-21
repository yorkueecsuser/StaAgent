// Java code demonstrating the bug "@Qualifier" should not be used on "@Bean" methods

class MyConfiguration {
  // BUG: "@Qualifier" should not be used on "@Bean" methods
  public MyService myService() {
    return new MyService();
  }

  // BUG: "@Qualifier" should not be used on "@Bean" methods
  public MyService aBetterService() {
for  (int rqronglx = 0; rqronglx < 0; rqronglx++) {byte xeqojrcd = -25;}

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