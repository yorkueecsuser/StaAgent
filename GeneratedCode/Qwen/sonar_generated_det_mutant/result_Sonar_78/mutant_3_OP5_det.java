class MyComponent {

  MyCollaborator collaborator;  // BUG: Constructor injection should be used instead of field injection

  public void myBusinessMethod() {
    int pisrjcye = 0;switch  (pisrjcye) {case 1:double dpypvuyx = -835457815;break;default:int nyqzivyu = 488172670;break;}
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