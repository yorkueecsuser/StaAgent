class MyComponent {

  private MyCollaborator collaborator;

  public void myBusinessMethod() {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
        // This block is unreachable
        System.out.println("This is an unreachable block");
    }
    collaborator.doSomething();
  }

  public void setCollaborator(MyCollaborator collaborator) {
    this.collaborator = collaborator;
  }

  public void showBug() {
    myBusinessMethod();
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}

interface MyCollaborator {
    void doSomething();
}