// Noncompliant code example with unreachable for loop mutant
// BUG: Constructor injection should be used instead of field injection
class MyComponent {

  private MyCollaborator collaborator;

  public void myBusinessMethod() {
    // Mutant: Unreachable for loop
    for (int i = 0; getCondition(); i++) {
      // This loop will never execute because getCondition() always returns false
    }

    collaborator.doSomething();
  }

  public void setCollaborator(MyCollaborator collaborator) {
    this.collaborator = collaborator;
  }

  public void showBug() {
    myBusinessMethod();
  }

  private boolean getCondition() {
    return false;
  }
}

interface MyCollaborator {
    void doSomething();
}