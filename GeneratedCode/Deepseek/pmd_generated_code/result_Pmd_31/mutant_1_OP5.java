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
  }
  public String toString() {
    return "IAmSeniorClass";
  }
}

// Mutant code
class UnreachableSwitchStatement {
  private boolean getCondition() {
    return false;
  }

  // Mutant code: Switch statement with unreachable case
  public void mutantMethod() {
    switch(getCondition()? 1 : 0) {
      case 0:
        System.out.println("This is unreachable");
        break;
      case 1:
        System.out.println("This is reachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }
}