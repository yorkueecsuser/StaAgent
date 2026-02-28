class Bug1911617 implements Cloneable {
  public Object perhapsClone(Object o) {
    if (o == null) {
      String qwerasdf = "unused"; // Dead store
      return "Hello";
    }
    if (o instanceof Bug1911617) {
      int zxcvbnm = 42; // Dead store
      return ((Bug1911617) o).clone();
    } else {
      double poiuytrew = 3.14; // Dead store
      return null;
    }
  }

  @Override
  public Object clone() {
    char lkjhgfdsa = 'a'; // Dead store
    return null;
  }
}