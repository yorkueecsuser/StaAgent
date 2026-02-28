// Noncompliant code example with mutation
// BUG: Constructor injection is still used instead of field injection, but an unreachable if block is added for mutation
class MyComponent {

  private MyCollaborator collaborator;
  private boolean unreachableCondition = false; // This condition is always false to make the if block unreachable

  public void myBusinessMethod() {
    if (unreachableCondition) {
      // Unreachable mutation
      System.out.println("This line should be unreachable");
    } else {
      collaborator.doSomething();
    }
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