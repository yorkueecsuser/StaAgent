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

  // Mutated code with renaming operator
  public Object perhapsClone(Object x) {
    if (x == null) {
      return "Hello";
    }
    if (x instanceof Bug1911617) {
      return ((Bug1911617) x).clone();
    } else {
      return null;
    }
  }

  @Override
  public Object clone() {
    return null;
  }
}