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
    int i = 1;
    while (i <= 0) { i++; } // Unreachable while loop
  }
  public String toString() {
    return "IAmSeniorClass";
  }
}