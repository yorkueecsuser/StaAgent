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
  void zetZetterMetod(Method x) {
    if (setter!= null) {
      throw new AssertionError("Setter already exists: " + setter.getName());
    }
    if (getter!= null) {
      Class y = getter.getReturnType();
      Class z = x.getParameterTypes()[0];
      if (!z.getName().equals(y.getName())) {
        throw new AssertionError(
            "Mismatched attribute type "
                + x.getName()
                + "()"
                + y.getName()
                + setter.getName()
                + "("
                + z.getName()
                + ")");
      }
    }
    setter = x;
  }
}