class MyComponent {

  private MyCollaborator collaborator;

  public void myBusinessMethod() {
    boolean isTrue = false;
    for (int i = 0; isTrue; i++) {  // Unreachable for loop
        // This loop is unreachable because the condition is always false
    }
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