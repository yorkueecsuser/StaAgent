import java.lang.reflect.Method;

class BadSetter {
  public Method getter, setter;

  void setSetterMethod(Method m) {
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is reachable but does nothing
        break;
      default:
        // This case is also reachable but does nothing
        break;
    }

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

    // Inserting an unreachable switch statement
    int unreachableValue = getUnreachableValue();
    switch (unreachableValue) {
      case 0:
        // This case is unreachable because getUnreachableValue() never returns 0
        System.out.println("This is an unreachable case.");
        break;
      case 1:
        // This case is also unreachable for the same reason
        System.out.println("Another unreachable case.");
        break;
    }
  }

  private boolean getCondition() {
    return true; // This ensures the switch statement has reachable cases
  }

  private int getUnreachableValue() {
    return 2; // This ensures the switch statement has unreachable cases
  }
}