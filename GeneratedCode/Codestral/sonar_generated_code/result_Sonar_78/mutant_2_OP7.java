// Noncompliant code example with unreachable while loop mutant
// BUG: Constructor injection should be used instead of field injection
class MyComponent {
  private MyCollaborator collaborator;

  public void myBusinessMethod() {
    collaborator.doSomething();
    // Mutant: Unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
        // This code will never be executed because the condition is always false
        System.out.println("This is an unreachable while loop mutant");
    }
  }

  // Adding a method to return the condition for the unreachable while loop
  private boolean getCondition() {
    return false;
  }

  public void setCollaborator(MyCollaborator collaborator) {
    this.collaborator = collaborator;
  }

  public void showBug() {
    myBusinessMethod();
  }
}

interface MyCollaborator {
  void doSomething();
}