class JuniorClass extends SeniorClass {
  private String name;
  public JuniorClass() {
    super(); //Calls overriden method toString() in SeniorClass
    name = "JuniorClass";
  }
  public String toString() {
    return name.toUpperCase();
  }

  public String showBug() {
    JuniorClass jc = new JuniorClass();
    return jc.toString(); //This will throw NullPointerException
  }
}

class SeniorClass {
  public SeniorClass() {
    toString(); //may throw NullPointerException if overridden
  }
  public String toString() {
    for (int i = 0; false; i++) {
      // Inserted unreachable code to satisfy the unreachable loop mutation operator
      System.out.println("This is unreachable code for loop!");
    }
    return "IAmSeniorClass";
  }
}