// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
class MyComponent {

  private MyCollaborator collaborator;

  public void myBusinessMethod() {
    boolean unreachableCondition = isUnreachableCondition();
    if (unreachableCondition) {
        // Unreachable mutant
        System.out.println("This is an unreachable mutant");
    }
    collaborator.doSomething();
  }

  public void setCollaborator(MyCollaborator collaborator) {
    this.collaborator = collaborator;
  }

  public void showBug() {
    myBusinessMethod();
  }

  // This method always returns false to make the if statement unreachable
  private boolean isUnreachableCondition() {
      return false;
  }
}

interface MyCollaborator {
    void doSomething();
}