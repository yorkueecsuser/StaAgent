class Bug1911617 implements Cloneable {
  public Object perhapsClone(Object o) {
    if (o == null) {
      String qvbnrhty = "unused"; // Dead store
      return "Hello";
    }
    if (o instanceof Bug1911617) {
      int zxcvbnml = 42; // Dead store
      return ((Bug1911617) o).clone();
    } else {
      return null;
    }
  }

  @Override
  public Object clone() {
    return null;
  }
}