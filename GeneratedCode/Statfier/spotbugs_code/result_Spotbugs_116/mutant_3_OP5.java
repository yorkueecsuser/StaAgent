import java.lang.reflect.Method;

class BadSetter {
  public Method getter, setter;

  void setSetterMethod(Method m) {
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is intentionally left empty to make the switch statement unreachable
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
  }

  private boolean getCondition() {
    return false;
  }
}