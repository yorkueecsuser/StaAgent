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
  }

  // Mutated code
  void setSetterMethod(Method x) {
    if (x!= null) {
      throw new AssertionError("Setter already exists: " + x.getName());
    }
    if (getter!= null) {
      Class a = getter.getReturnType();
      Class b = x.getParameterTypes()[0];
      if (!b.getName().equals(a.getName())) {
        throw new AssertionError(
            "Mismatched attribute type "
                + x.getName()
                + "()"
                + a.getName()
                + setter.getName()
                + "("
                + b.getName()
                + ")");
      }
    }
    setter = x;
  }
}