class Bug1911617 implements Cloneable {
  public Object perhapsClone(Object o) {
    if (o == null) {
      return "Hello";
    }
    if (o instanceof Bug1911617) {
      return ((Bug1911617) o).clone();
    } else {
      return null;
    }
  }

  @Override
  public Object clone() {
    return null;
  }

  // Inserting an unreachable switch statement
  private boolean getUnreachableCondition() {
    return false;
  }

  public void someMethod() {
    boolean condition = getUnreachableCondition();
    switch (condition) {
      case true:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("This is also unreachable");
        break;
    }
  }
}