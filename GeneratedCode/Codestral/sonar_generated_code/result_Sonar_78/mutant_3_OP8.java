// Noncompliant code example with mutation
// BUG: Constructor injection should be used instead of field injection
class MyComponent {

  private MyCollaborator c;  // Mutant: Renamed collaborator to c

  public void myBusinessMethod() {
    c.doSomething();  // This line needs to be updated accordingly
  }

  public void setCollaborator(MyCollaborator collaborator) {
    this.c = collaborator;  // Updated to reflect the new variable name
  }

  public void showBug() {
    myBusinessMethod();  // This will throw a NullPointerException if MyComponent is instantiated without a DI framework
  }
}

interface MyCollaborator {
    void doSomething();
}