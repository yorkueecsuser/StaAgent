class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    return new CloneIdiom3();
    return new CloneIdiom3(); // Mutant: duplicated the return statement
  }
}