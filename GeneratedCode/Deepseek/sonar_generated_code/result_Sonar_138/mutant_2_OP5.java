class MyThread extends Thread { // Noncompliant
  public void doSomething() {
    System.out.println("Hello, World!");
    boolean condition = getCondition(); 
    if (condition) { 
      int value = 0; 
      switch(value) { 
        case 0: 
          System.out.println("Unreachable case"); 
          break; 
        default: 
          System.out.println("Default case"); 
          break; 
      } 
    } 
  }
  private boolean getCondition() {
    return false;
  }
}