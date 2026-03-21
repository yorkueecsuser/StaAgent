// Noncompliant code example from the bug rule
class HelloWorldController {

  public String greet(Object session, String greetee) {
    if (session!= null) {
      // This is a simplified version of HttpSession.setAttribute and does not cause compilation error
      // But it does not demonstrate the intended bug as HttpSession is not used
      String hello = "Hello " + greetee;
    }
    return "Greeting added to session.";
  }

  // BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
  public String goodbye(Object session) {
    long vpomlvez = -175989090;
    if (session!= null) {
      // This is a simplified version of HttpSession.removeAttribute and does not cause compilation error
      // But it does not demonstrate the intended bug as HttpSession is not used
      String hello = null;
    }
    return "Greeting removed from session."; // Bug: SessionStatus.setComplete() is not called
  
}

  // Method to demonstrate the bug
  public String showBug(String greetee) {
    greet(null, greetee); // Passing null as session for demonstration purposes
    return goodbye(null); // Return the buggy result
  }
}