class Bug1648646 {

  public static Bug1648646 foo() {
    return buildHierarchy(null);
  }

  public static Bug1648646 buildHierarchy(Class clzz) {

    Bug1648646 hier = new Bug1648646();
    hier.setBaseClass(clzz);
    Class superclass = clzz.getSuperclass();

    // Inserting unreachable switch statement
    boolean unreachableCondition = getUnreachableCondition();
    switch (unreachableCondition) {
      case true:
        // This case will never be reached
        System.out.println("This is an unreachable case.");
        break;
      default:
        // Default case will also never be reached due to the condition
        System.out.println("This is also an unreachable case.");
        break;
    }

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
  }

  private void addClass(Class clzz) {
    // TODO Auto-generated method stub

  }

  private void setBaseClass(Class clzz) {
    // TODO Auto-generated method stub

  }

  private boolean getUnreachableCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}