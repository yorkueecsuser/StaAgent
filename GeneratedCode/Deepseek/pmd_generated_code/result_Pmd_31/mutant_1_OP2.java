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
    return jc.super.toString(); //Duplicating super.toString()
  }
}

class SeniorClass {
  public SeniorClass() {
    super.toString(); //may throw NullPointerException if overridden
  }
  public String toString() {
    return "IAmSeniorClass";
  }
}