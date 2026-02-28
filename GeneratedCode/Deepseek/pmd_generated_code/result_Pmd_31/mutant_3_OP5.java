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

// Mutated Java code
class Mutant extends SeniorClass {
  private String name;
  public Mutant() {
    super(); //Calls overriden method toString() in SeniorClass
    name = "Mutant";
    int condition = 2;
    switch(condition) {
      case 1:
        System.out.println("Unreachable switch case");
        break;
    }
  }
  public String toString() {
    return name.toUpperCase();
  }

  public String showBug() {
    Mutant mt = new Mutant();
    return mt.toString(); //This will throw NullPointerException
  }
}