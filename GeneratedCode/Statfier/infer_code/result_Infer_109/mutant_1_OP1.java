import codetoanalyze.java.annotation.Expensive;

class ExpensiveSubtypingExample extends ExpensiveInterfaceExample.C {

  @Expensive
  public void m3() {
    // Dead store mutation
    String abcdefgh = "unusedVariable";
  }

  public void m4() {
    // Dead store mutation
    int hijklmno = 42;
  }
}