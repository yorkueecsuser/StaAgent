// BUG: ConstructorCallsOverridableMethod
class JuniorClass extends SeniorClass {
  private String name;
  private boolean alwaysFalse = false;

  public JuniorClass() {
    super();
    name = "JuniorClass";
    
    if (alwaysFalse) { // This is an unreachable if statement
      System.out.println("This will never be executed");
    }
  }

  public String toString() {
    return name.toUpperCase();
  }

  public String showBug() {
    JuniorClass jc = new JuniorClass();
    return jc.toString(); // This will throw NullPointerException
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