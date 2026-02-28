class Bug1648646 {

  public static Bug1648646 foo() {
    return buildHierarchy(null);
  }

  public static Bug1648646 buildHierarchy(Class clzz) {

    Bug1648646 hier = new Bug1648646();
    hier.setBaseClass(clzz);
    Class superclass = clzz.getSuperclass();

    if (superclass!= null && superclass.getName().equals("java.lang.Object")) {
      return hier;
    } else {
      // Inserting unreachable for loop
      boolean conditionFor = getCondition();
      for (int i = 0; conditionFor; i++) {
        // This loop is unreachable because getCondition() will never return true
      }

      while ((clzz.getSuperclass()!= null)
          && (!clzz.getSuperclass().getName().equals("java.lang.Object"))) {
        clzz = clzz.getSuperclass();
        hier.addClass(clzz);
      }
      return hier;
    }
  }

  private void addClass(Class clzz) {
    // TODO Auto-generated method stub

  }

  private void setBaseClass(Class clzz) {
    // TODO Auto-generated method stub

  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined and always false
    return false;
  }
}