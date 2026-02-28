// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
class MyComponent {  // Anyone can call the default constructor

  private MyCollaborator collaborator;  // Noncompliant
  private MyCollaborator a;  // Mutant: Renamed collaborator to a

  public void myBusinessMethod() {
    collaborator.doSomething();  // this will fail in classes new-ed by a caller
    if(a!= null){  // Added to avoid NullPointerException
        a.doSomething();  // Mutant: Using the renamed variable
    }
  }

  public void setCollaborator(MyCollaborator collaborator) {
    this.collaborator = collaborator;
    this.a = collaborator;  // Mutant: Also setting the renamed variable
  }

  public void showBug() {
    myBusinessMethod();  // This will throw a NullPointerException if MyComponent is instantiated without a DI framework
  }
}

interface MyCollaborator {
    void doSomething();
}