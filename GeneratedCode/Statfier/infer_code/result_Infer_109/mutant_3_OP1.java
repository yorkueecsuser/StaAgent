import codetoanalyze.java.annotation.Expensive;

class ExpensiveSubtypingExample extends ExpensiveInterfaceExample.C {

  @Expensive
  public void m3() {
    // Dead Store Mutation
    String abcdefgh = "unusedVariable";
  }

  public void m4() {
    // Dead Store Mutation
    int hijklmno = 42;
  }
}