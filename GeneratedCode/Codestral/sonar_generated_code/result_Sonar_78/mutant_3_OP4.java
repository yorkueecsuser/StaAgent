// Noncompliant code example with added unreachable if-else statement mutant
// BUG: Constructor injection should be used instead of field injection
class MyComponent {  // Anyone can call the default constructor

  private MyCollaborator collaborator;  // Noncompliant

  public void myBusinessMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
        // Mutant: Unreachable if-else statement
        if (false) {
            System.out.println("This code should never be executed.");
        } else {
            collaborator.doSomething();  // this will fail in classes new-ed by a caller
        }
    }
  }

  private boolean getCondition() {
      return true;
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