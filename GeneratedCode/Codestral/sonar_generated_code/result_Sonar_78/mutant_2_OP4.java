import java.util.Random;

// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
class MyComponent {

  private MyCollaborator collaborator;

  public void myBusinessMethod() {
    collaborator.doSomething();
    unreachableCode();
  }

  private void unreachableCode() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never be executed due to the false condition
      throw new RuntimeException("This is unreachable code");
    } else {
      // This block is here to make the if-else statement reachable
    }
  }

  private boolean getCondition() {
    // For demonstration purposes, this method always returns false to make the block unreachable
    return new Random().nextBoolean();
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