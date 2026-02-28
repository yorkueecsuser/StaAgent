// Noncompliant code example with a dead store mutation
// BUG: Constructor injection should be used instead of field injection
class MyComponent {  // Anyone can call the default constructor

  private MyCollaborator collaborator;  // Noncompliant
  private int deadStoreVar; // Mutation: Adding an unused int variable (dead store)

  public void myBusinessMethod() {
    collaborator.doSomething();  // this will fail in classes new-ed by a caller
  }

  public void setCollaborator(MyCollaborator collaborator) {
    this.collaborator = collaborator;
    this.deadStoreVar = 10; // Assigning a value to the dead store variable to avoid compilation errors
  }

  public void showBug() {
    myBusinessMethod();  // This will throw a NullPointerException if MyComponent is instantiated without a DI framework
  }
}

interface MyCollaborator {
    void doSomething();
}