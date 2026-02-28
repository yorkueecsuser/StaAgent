import codetoanalyze.java.annotation.Expensive;

class ExpensiveSubtypingExample extends ExpensiveInterfaceExample.C {

  @Expensive
  public void m3() {}

  public void m4() {}

  // Mutated code
  public void a() {}
}