class MyComponent {

  MyCollaborator collaborator;  // BUG: Constructor injection should be used instead of field injection
  MyCollaborator a;  // Mutated variable

  public void myBusinessMethod() {
    collaborator.doSomething();
    a.doSomething();  // Mutated method call
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