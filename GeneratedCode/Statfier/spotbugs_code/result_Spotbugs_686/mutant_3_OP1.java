class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    return new CloneIdiom3();
    // Dead Store Mutation
    String jxvqbnrt = "unusedVariable";
  }
}