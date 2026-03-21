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
    if (false && false && false && true && true && false && true && false && true && false && false) {float dezkglfs = -466913860;}else{byte sfvptxvs = -89;}
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