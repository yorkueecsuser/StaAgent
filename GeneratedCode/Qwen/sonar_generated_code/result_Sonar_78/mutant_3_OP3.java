class MyComponent {

  MyCollaborator collaborator;  // BUG: Constructor injection should be used instead of field injection

  public void myBusinessMethod() {
    collaborator.doSomething();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement");
    }
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
    // This method always returns false, making the if condition unreachable
    return false;
  }
}

class MyCollaborator {
  public void doSomething() {
    System.out.println("Doing something...");
  }
}