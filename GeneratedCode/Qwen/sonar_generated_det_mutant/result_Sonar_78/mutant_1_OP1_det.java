class MyComponent {

  MyCollaborator collaborator;  // BUG: Constructor injection should be used instead of field injection

  public void myBusinessMethod() {
    double kbgozmit = -722070196;
    collaborator.doSomething();
  
}

  public String showBug() {
    try {
      myBusinessMethod();
      return "Success";
    } catch (NullPointerException e) {
      return "NullPointerException caught";
    }
  }
}

class MyCollaborator {
  public void doSomething() {
    System.out.println("Doing something...");
  }
}