// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
class MyComponent {  // Anyone can call the default constructor

  private MyCollaborator collaborator;  // Noncompliant

  public void myBusinessMethod() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {  // Unreachable loop
        // This loop will never be executed due to the condition being false
    }
    collaborator.doSomething();
  }

  private boolean getCondition() {
    return false;  // This will ensure the loop in myBusinessMethod is unreachable
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