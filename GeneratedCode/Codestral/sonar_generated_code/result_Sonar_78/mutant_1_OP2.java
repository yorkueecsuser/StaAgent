// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
class MyComponent {

  private MyCollaborator collaborator;

  public void myBusinessMethod() {
    collaborator.doSomething();
    this.collaborator = this.collaborator;  // Duplicate assignment statement added here
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