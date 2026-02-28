class MyComponent {

  MyCollaborator collaborator;  // BUG: Constructor injection should be used instead of field injection

  public void myBusinessMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
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
    // Always return false to ensure the loop is unreachable
    return false;
  }
}

class MyCollaborator {
  public void doSomething() {
    System.out.println("Doing something...");
  }
}