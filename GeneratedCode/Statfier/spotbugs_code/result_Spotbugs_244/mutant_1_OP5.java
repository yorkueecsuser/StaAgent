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
      while ((clzz.getSuperclass()!= null)
          && (!clzz.getSuperclass().getName().equals("java.lang.Object"))) {
        clzz = clzz.getSuperclass();
        hier.addClass(clzz);
      }
      return hier;
    }

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition) {
      case true:
        // This case is unreachable because getCondition() will never return true
        System.out.println("This is an unreachable case.");
        break;
      default:
        // This default case is also unreachable for the same reason
        System.out.println("This is another unreachable case.");
        break;
    }
  }

  private void addClass(Class clzz) {
    // TODO Auto-generated method stub

  }

  private void setBaseClass(Class clzz) {
    // TODO Auto-generated method stub

  }

  private static boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}