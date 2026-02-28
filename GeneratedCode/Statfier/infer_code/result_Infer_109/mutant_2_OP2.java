import codetoanalyze.java.annotation.Expensive;

class ExpensiveSubtypingExample extends ExpensiveInterfaceExample.C {

  @Expensive
  public void m3() {}

  public void m4() {
    int x = 5; // Introduced assignment statement for demonstration
    int x = 5; // Duplicated assignment statement
  }
}