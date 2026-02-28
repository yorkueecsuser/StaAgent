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
      // Inserting an unreachable if-else branch
      boolean unreachableCondition = getUnreachableCondition();
      if (unreachableCondition) {
        // This block should never be executed
        System.out.println("This is an unreachable block");
      } else {
        // This block will always be executed
        while ((clzz.getSuperclass()!= null)
            && (!clzz.getSuperclass().getName().equals("java.lang.Object"))) {
          clzz = clzz.getSuperclass();
          hier.addClass(clzz);
        }
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
    // This method always returns false, making the if-block unreachable
    return false;
  }
}