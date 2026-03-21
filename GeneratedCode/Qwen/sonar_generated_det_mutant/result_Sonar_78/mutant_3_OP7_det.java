class MyComponent {

  MyCollaborator collaborator;  // BUG: Constructor injection should be used instead of field injection

  public void myBusinessMethod() {
    boolean lmlevuwp = false;while (lmlevuwp && false && true && true && true && true && false && false && false && true && true && false) {int raflbdll = -804423740;}
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