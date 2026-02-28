import codetoanalyze.java.annotation.Expensive;

class ExpensiveSubtypingExample extends ExpensiveInterfaceExample.C {

  @Expensive
  public void m3() {}

  public void m4() {
    int originalVariable = 10; // Introduced user-defined variable
    System.out.println(originalVariable);
    
    int a = 10; // Mutated variable
    System.out.println(a);
  }
}