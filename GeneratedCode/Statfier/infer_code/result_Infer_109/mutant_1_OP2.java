import codetoanalyze.java.annotation.Expensive;

class ExpensiveSubtypingExample extends ExpensiveInterfaceExample.C {

  @Expensive
  public void m3() {
    int x = 5; // Hypothetical assignment statement
    int x = 5; // Duplicated assignment statement
  }

  public void m4() {}
}