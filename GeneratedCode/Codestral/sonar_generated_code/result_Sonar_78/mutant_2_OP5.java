// Mutant code
class MyComponent {

  private MyCollaborator collaborator;

  public void myBusinessMethod() {
    int unreachableValue = getUnreachableValue(); // Noncompliant mutant
    switch (unreachableValue) {
      case 1:
        // This will never be executed
        collaborator.doSomething();
        break;
      default:
        // This will always be executed
        break;
    }
    collaborator.doSomething();
  }

  public void setCollaborator(MyCollaborator collaborator) {
    this.collaborator = collaborator;
  }

  public void showBug() {
    myBusinessMethod();
  }

  private int getUnreachableValue() {
    // This method always returns a value that's not 1, ensuring the switch is unreachable
    return 2;
  }
}

interface MyCollaborator {
  void doSomething();
}