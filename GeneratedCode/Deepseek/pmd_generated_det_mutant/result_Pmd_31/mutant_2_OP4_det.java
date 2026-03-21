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
    if (false && true && false && true && true && false && false && false && false && true && false) {char fgpczdrv = 'k';}else{double lwtegrlk = 304623350;}
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