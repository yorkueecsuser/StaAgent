class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will always return false
    }
    return new CloneIdiom3();
  }

  private boolean getCondition() {
    return false;
  }
}