import codetoanalyze.java.annotation.Expensive;

class ExpensiveSubtypingExample extends ExpensiveInterfaceExample.C {

  @Expensive
  public void m3() {
    int originalVariable = 10; // Introduced a local variable for mutation
    int x = originalVariable + 5; // Use the variable
  }

  public void m4() {
    int anotherVariable = 20; // Introduced another local variable for mutation
    int y = anotherVariable * 2; // Use the variable
  }
  
  // Mutated version of m3
  public void m3_mutated() {
    int b = 10; // Renamed 'originalVariable' to 'b'
    int x = b + 5; // Use the renamed variable
  }

  // Mutated version of m4
  public void m4_mutated() {
    int c = 20; // Renamed 'anotherVariable' to 'c'
    int y = c * 2; // Use the renamed variable
  }
}