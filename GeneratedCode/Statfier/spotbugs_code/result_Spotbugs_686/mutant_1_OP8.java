class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    return new CloneIdiom3();
  }

  // Mutated code
  public Object z() {
    return new CloneIdiom3();
  }
}