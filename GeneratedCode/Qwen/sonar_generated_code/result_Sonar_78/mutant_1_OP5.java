class MyComponent {

  MyCollaborator collaborator;  // BUG: Constructor injection should be used instead of field injection

  public void myBusinessMethod() {
    collaborator.doSomething();
    // Introduced unreachable switch statement
    boolean switchCondition = getSwitchCondition();
    switch (switchCondition) {
      case true:
        System.out.println("This is unreachable code.");
        break;
      default:
        // Do nothing
        break;
    }
  }

  private boolean getSwitchCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }

  public String showBug() {
    try {
      myBusinessMethod();
      return "Success";
    } catch (NullPointerException e) {
      return "NullPointerException caught";
    }
  }
}

class MyCollaborator {
  public void doSomething() {
    System.out.println("Doing something...");
  }
}