class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    return new CloneIdiom3();
    // Mutant: Duplicate the return statement
    return new CloneIdiom3();
  }
}