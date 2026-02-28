class MyComponent {

  MyCollaborator collaborator;  // BUG: Constructor injection should be used instead of field injection

  public void myBusinessMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    collaborator.doSomething();
  }

  public String showBug() {
    try {
      myBusinessMethod();
      return "Success";
    } catch (NullPointerException e) {
      return "NullPointerException caught";
    }
  }

  private boolean getCondition() {
    return false; // This method returns false, but the condition variable is not final, making the loop technically unreachable at runtime
  }
}

class MyCollaborator {
  public void doSomething() {
    System.out.println("Doing something...");
  }
}