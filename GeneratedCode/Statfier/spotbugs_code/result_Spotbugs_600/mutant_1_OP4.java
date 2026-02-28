class Bug1911617 implements Cloneable {
  public Object perhapsClone(Object o) {
    if (o == null) {
      return "Hello";
    }
    if (o instanceof Bug1911617) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // This is an unreachable block due to the condition being dynamically determined and set to false at runtime
        return ((Bug1911617) o).clone();
      } else {
        // Another unreachable block
        return "Unreachable";
      }
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
    return false; // This method ensures the condition is dynamically determined but set to false
  }
}