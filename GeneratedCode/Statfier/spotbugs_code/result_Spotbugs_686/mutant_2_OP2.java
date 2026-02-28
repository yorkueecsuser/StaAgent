class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    return new CloneIdiom3();
    // Mutant: Duplicating the return statement
    return new CloneIdiom3();
  }
}