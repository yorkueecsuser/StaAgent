import java.lang.reflect.Method;

class BadSetter {
  public Method getter, setter;

  void setSetterMethod(Method m) {
    boolean condition = getCondition(); // This method ensures the condition is dynamically determined

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
      // This block will never execute because condition is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because condition is always false
      System.out.println("This is another unreachable block");
    }
  }

  // Method to dynamically determine the condition
  private boolean getCondition() {
    return false; // This method returns false, making the if-else block unreachable
  }
}