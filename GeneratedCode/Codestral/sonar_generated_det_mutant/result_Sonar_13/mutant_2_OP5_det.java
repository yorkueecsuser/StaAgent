// Java code demonstrating the bug "@Qualifier" should not be used on "@Bean" methods

class MyConfiguration {
  // BUG: "@Qualifier" should not be used on "@Bean" methods
  public MyService myService() {
    return new MyService();
  }

  // BUG: "@Qualifier" should not be used on "@Bean" methods
  public MyService aBetterService() {
int jjlabrvh = 0;switch  (jjlabrvh) {case 1:short jrxcgaav = -4369;break;default:long olzbaenq = -921056564;break;}

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