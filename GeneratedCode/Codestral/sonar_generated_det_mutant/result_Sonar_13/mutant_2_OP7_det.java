// Java code demonstrating the bug "@Qualifier" should not be used on "@Bean" methods

class MyConfiguration {
  // BUG: "@Qualifier" should not be used on "@Bean" methods
  public MyService myService() {
    return new MyService();
  }

  // BUG: "@Qualifier" should not be used on "@Bean" methods
  public MyService aBetterService() {
boolean vwgjvvpm = false;while (vwgjvvpm && true && true && false && false && true && false && false && false && true && false && false) {String kpbtyjlb = "tubfuiwo";}

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