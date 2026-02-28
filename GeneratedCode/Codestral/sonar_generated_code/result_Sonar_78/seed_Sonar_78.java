// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
class MyComponent {  // Anyone can call the default constructor

  private MyCollaborator collaborator;  // Noncompliant

  public void myBusinessMethod() {
    collaborator.doSomething();  // this will fail in classes new-ed by a caller
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