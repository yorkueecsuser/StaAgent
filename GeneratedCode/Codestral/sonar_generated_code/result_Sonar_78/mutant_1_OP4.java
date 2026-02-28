// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
class MyComponent {

  private MyCollaborator collaborator;

  public void myBusinessMethod() {
    boolean shouldRun = isFalseCondition();
    if (shouldRun) {
      // This block is unreachable because isFalseCondition() always returns false
      System.out.println("This line will never be executed");
    } else {
      collaborator.doSomething();
    }
  }

  public void setCollaborator(MyCollaborator collaborator) {
    this.collaborator = collaborator;
  }

  public void showBug() {
    myBusinessMethod();
  }

  // This method is added to provide a dynamically determined false condition
  private boolean isFalseCondition() {
    return false;
  }
}

interface MyCollaborator {
    void doSomething();
}