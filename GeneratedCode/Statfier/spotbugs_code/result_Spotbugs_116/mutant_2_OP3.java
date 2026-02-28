import java.lang.reflect.Method;

class BadSetter {
  public Method getter, setter;

  void setSetterMethod(Method m) {
    boolean condition = getCondition(); // This ensures the if statement is not a compile-time constant
    if (condition) {
      // Unreachable code block
      System.out.println("This is an unreachable if statement.");
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
    return false; // This method returns false, making the if block unreachable at runtime
  }
}