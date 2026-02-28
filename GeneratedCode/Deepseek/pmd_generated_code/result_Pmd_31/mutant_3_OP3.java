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
    JuniorClass jc = new JuniorClass();
    return jc.toString(); //This will throw NullPointerException
  }
}

class SeniorClass {
  public SeniorClass() {
    toString(); //may throw NullPointerException if overridden
    if(false) {
      System.out.println("This is an unreachable statement");
    }
  }
  public String toString() {
    return "IAmSeniorClass";
  }
}