import java.lang.reflect.Method;

class BadSetter {
  public Method getter, setter;

  void setSetterMethod(Method m) {
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

    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable if condition is true
      System.out.println("This is a reachable block.");
    } else {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block due to the condition.");
    }
  }

  private boolean getCondition() {
    // Always return false to ensure the else block is unreachable
    return false;
  }
}