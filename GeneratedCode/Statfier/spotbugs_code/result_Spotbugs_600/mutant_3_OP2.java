class Bug1911617 implements Cloneable {
  public Object perhapsClone(Object o) {
    if (o == null) {
      return "Hello";
    }
    if (o instanceof Bug1911617) {
      Object clonedObject = ((Bug1911617) o).clone();
      Object clonedObjectCopy = clonedObject; // Duplicate assignment
      return clonedObject;
    } else {
      return null;
    }
  }

  @Override
  public Object clone() {
    return null;
  }
}