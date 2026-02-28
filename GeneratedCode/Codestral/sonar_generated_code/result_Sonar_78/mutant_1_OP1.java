import java.util.Random;

class MyComponent {
  private MyCollaborator collaborator;
  // Mutant code - Dead Store
  private String aabrjxzi = generateRandomString(8);

  public void myBusinessMethod() {
    collaborator.doSomething();
  }

  public void setCollaborator(MyCollaborator collaborator) {
    this.collaborator = collaborator;
  }

  public void showBug() {
    myBusinessMethod();
  }

  private String generateRandomString(int length) {
    String characters = "abcdefghijklmnopqrstuvwxyz";
    StringBuilder result = new StringBuilder();
    Random random = new Random();
    for (int i = 0; i < length; i++) {
      result.append(characters.charAt(random.nextInt(characters.length())));
    }
    return result.toString();
  }
}

interface MyCollaborator {
  void doSomething();
}