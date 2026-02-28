// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
class MyComponent {  // Anyone can call the default constructor

  private MyCollaborator collaborator;  // Noncompliant

  public void myBusinessMethod() {
    int value = getValue();
    switch(value) {
      case 1:
        collaborator.doSomething(); // This will never be executed
        break;
      default:
        // Handle default case
    }
    collaborator.doSomething();  // this will fail in classes new-ed by a caller
  }

  private int getValue() {
    return 0; // Always returns a value other than 1
  }

  public void setCollaborator(MyCollaborator collaborator) {
    this.collaborator = collaborator;
  }

  public void showBug() {
    myBusinessMethod();  // This will throw a NullPointerException if MyComponent is instantiated without a DI framework
  }
}

interface MyCollaborator {
    void doSomething();
}