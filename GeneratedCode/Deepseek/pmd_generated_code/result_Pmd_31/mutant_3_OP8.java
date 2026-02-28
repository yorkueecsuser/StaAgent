// BUG: ConstructorCallsOverridableMethod
class JuniorClass extends SeniorClass {
  private String nameRenamed; //renamed variable
  public JuniorClass() {
    super(); 
    nameRenamed = "JuniorClass"; //replaced reference to renamed variable
  }
  public String toString() {
    return nameRenamed.toUpperCase(); //replaced reference to renamed variable
  }

  public String showBug() {
    JuniorClass jc = new JuniorClass();
    return jc.toString(); 
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