class Bug1648646 {

  public static Bug1648646 foo() {
    return buildHierarchy(null);
  }

  public static Bug1648646 buildHierarchy(Class clzz) {

    Bug1648646 hier = new Bug1648646();
    hier.setBaseClass(clzz);
    Class superclass = clzz.getSuperclass();

    // Inserting an unreachable if-else statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      hier.addClass(String.class);
    } else {
      // This block is also unreachable
      hier.setBaseClass(Integer.class);
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

  // Method to provide a dynamically determined condition
  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the branches unreachable
  }
}