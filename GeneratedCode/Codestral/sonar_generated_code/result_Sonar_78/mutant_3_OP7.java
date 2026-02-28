// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
import java.util.Random;

class MyComponent {

  private MyCollaborator collaborator;
  private Random random = new Random();

  public void myBusinessMethod() {
    collaborator.doSomething();
  }

  public void setCollaborator(MyCollaborator collaborator) {
    this.collaborator = collaborator;
  }

  public void showBug() {
    myBusinessMethod();
  }

  public void unreachableWhileLoop() {
    boolean conditionWhile = getFalseCondition();
    while (conditionWhile) {
      // This code will never be executed
    }
  }

  private boolean getFalseCondition() {
    // This method ensures that the condition is not a compile-time constant
    // and is dynamically determined at runtime
    return random.nextBoolean(); // This will always return false
  }
}

interface MyCollaborator {
  void doSomething();
}