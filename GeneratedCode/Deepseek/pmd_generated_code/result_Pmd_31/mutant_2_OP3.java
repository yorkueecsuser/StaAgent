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

// Mutant Code
class JuniorClassMutant extends SeniorClass {
  private String name;
  public JuniorClassMutant() {
    super(); //Calls overriden method toString() in SeniorClass
    name = "JuniorClass";
  }
  public String toString() {
    return name.toUpperCase();
  }

  public String showBug() {
    JuniorClassMutant jc = new JuniorClassMutant();
    return jc.toString(); 
  }
  
  public String showMutantBug() {
    boolean condition = false;
    if (condition) {
      JuniorClassMutant jc = new JuniorClassMutant();
      return jc.toString(); 
    } else {
      return "unreachable code";
    }
  }
}

class SeniorClassMutant {
  public SeniorClassMutant() {
    toString(); //may throw NullPointerException if overridden
  }
  public String toString() {
    return "IAmSeniorClass";
  }
  
  public String showMutantBug() {
    boolean condition = false;
    if (condition) {
      return toString(); 
    } else {
      return "unreachable code";
    }
  }
}