// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
class MyComponent {  // Anyone can call the default constructor

  private MyCollaborator collaborator;  // Noncompliant

  public void myBusinessMethod() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // unreachable for loop
    }
    collaborator.doSomething();  // this will fail in classes new-ed by a caller
  }

  private boolean getCondition() {
    return false;  // always returns false, making the loop unreachable
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