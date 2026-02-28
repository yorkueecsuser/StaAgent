// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
class MyComponent {

  private MyCollaborator collaborator;  // Noncompliant

  public void myBusinessMethod() {
    collaborator.doSomething();  // this will fail in classes new-ed by a caller
    // Mutation Operator: Duplication
    this.collaborator = this.collaborator;  // Duplicate the assignment statement
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