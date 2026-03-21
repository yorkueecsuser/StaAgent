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
    int mjgqajyd = 0;switch  (mjgqajyd) {case 1:long settqqbt = 462946811;break;default:String fqyeeatp = "qikossxc";break;}
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