import java.lang.reflect.Method;

class BadSetter {
  public Method getter, setter;

  void setSetterMethod(Method m) {
    boolean condition = getCondition(); // Dynamically determined condition

    if (setter!= null) {
      throw new AssertionError("Setter already exists: " + setter.getName());
    }
    if (getter!= null) {
      Class getterType = getter.getReturnType();
      Class setterType = m.getParameterTypes()[0];
      if (!setterType.getName().equals(getterType.getName())) {
        throw new AssertionError(
            "Mismatched attribute type "
                + m.getName()
                + "()"
                + getterType.getName()
                + setter.getName()
                + "("
                + setterType.getName()
                + ")");
      }
    }
    setter = m;

    // Inserting an unreachable if-else branch
    if (condition) {
      // This block is reachable
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because condition is always false
      System.out.println("This is an unreachable block.");
    }
  }

  // Method to provide a dynamically determined condition
  private boolean getCondition() {
    return false; // This method always returns false, making the else block unreachable
  }
}