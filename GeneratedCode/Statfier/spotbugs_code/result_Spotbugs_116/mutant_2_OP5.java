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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case will never be reached because getCondition() does not return true
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case to satisfy switch requirement
        break;
    }
  }

  private boolean getCondition() {
    // This method returns false, ensuring the switch statement is unreachable
    return false;
  }
}