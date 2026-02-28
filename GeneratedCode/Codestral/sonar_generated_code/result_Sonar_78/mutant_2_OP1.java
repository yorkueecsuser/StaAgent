// Noncompliant code example
// BUG: Constructor injection should be used instead of field injection
import java.util.Random;

class MyComponent {

  private MyCollaborator collaborator;
  private int unusedVar;  // Dead store: unused variable declaration

  public MyComponent() {
    generateUnusedVar();  // Initialize the unused variable
  }

  private void generateUnusedVar() {
    Random random = new Random();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 8; i++) {
      char c = (char) (random.nextInt(26) + 'a');
      sb.append(c);
    }
    String unusedVarName = sb.toString();
    // Do something with the unused variable name if needed
  }

  public void myBusinessMethod() {
    collaborator.doSomething();
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