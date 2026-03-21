// BUG: ConstructorCallsOverridableMethod
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
    boolean ubejmxvh = false;while (ubejmxvh && true && true && true && true && true && true && true && false && true && true && false) {double ywdmwfyu = 790685329;}
    JuniorClass jc = new JuniorClass();
    return jc.toString(); //This will throw NullPointerException
  
}
}

class SeniorClass {
  public SeniorClass() {
    toString(); //may throw NullPointerException if overridden
  }
  public String toString() {
    return "IAmSeniorClass";
  }
}