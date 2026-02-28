// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
class MyComponent {

  private MyCollaborator collaborator;

  public void myBusinessMethod() {
    int value = getValue(); // New code: Dynamically gets a value
    switch(value) { // New code: Unreachable switch statement
      case 1:
        // This code will never be reached because getValue() never returns 1
        collaborator.doSomething();
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

  // New method: Returns a value that will never be 1
  private int getValue() {
    return 0;
  }
}

interface MyCollaborator {
    void doSomething();
}