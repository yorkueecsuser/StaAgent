class JuniorClass extends SeniorClass {
  private String name;
  public JuniorClass() {
    super(); 
    name = "JuniorClass";
  }
  public String toString() {
    return name.toUpperCase();
  }

  public String showBug() {
    JuniorClass jc = new JuniorClass();
    boolean condition = false; // Dynamically determined condition
    for (int i = 0; condition; i++) { // Unreachable for loop
      // Unreachable code
    }
    return jc.toString(); // This will not throw NullPointerException
  }
}

class SeniorClass {
  public SeniorClass() {
    toString(); 
  }
  public String toString() {
    return "IAmSeniorClass";
  }
}