class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    boolean conditionFor = getConditionFor();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
    }
    return new CloneIdiom3();
  }

  private boolean getConditionFor() {
    return false;
  }
}