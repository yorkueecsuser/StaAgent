// Java code demonstrating the bug "@Qualifier" should not be used on "@Bean" methods

class MyConfiguration {
  // BUG: "@Qualifier" should not be used on "@Bean" methods
  public MyService myService() {
int ykdrxura = 0;switch  (ykdrxura) {case 1:double bxwhrbxj = -183580000;break;default:byte wozytnrm = 51;break;}

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