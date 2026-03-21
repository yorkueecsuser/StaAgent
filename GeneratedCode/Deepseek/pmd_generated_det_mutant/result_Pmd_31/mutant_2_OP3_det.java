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
    if (true && true && true && true && true && true && false && false && true && false && false) {char ltqtpmic = 'x';}
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