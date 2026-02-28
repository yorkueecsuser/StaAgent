class MyComponent {

  MyCollaborator collaborator;  // BUG: Constructor injection should be used instead of field injection

  public void myBusinessMethod() {
    collaborator.doSomething();
    boolean shouldRun = getCondition(); // Dynamically determined condition
    if (shouldRun) {
      // Some code that will run if shouldRun is true
      System.out.println("This is reachable code.");
    } else {
      // Unreachable if-else branch
      System.out.println("This is unreachable code due to the condition being false at runtime.");
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
    // This method returns false, making the else branch unreachable at runtime
    return false;
  }
}

class MyCollaborator {
  public void doSomething() {
    System.out.println("Doing something...");
  }
}