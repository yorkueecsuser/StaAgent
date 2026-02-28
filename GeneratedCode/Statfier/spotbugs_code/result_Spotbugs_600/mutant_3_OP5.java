class Bug1911617 implements Cloneable {
  public Object perhapsClone(Object o) {
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        return "Unreachable";
    }

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

  private boolean getCondition() {
    // This method ensures that the condition is always false, making the switch case unreachable
    return false;
  }
}