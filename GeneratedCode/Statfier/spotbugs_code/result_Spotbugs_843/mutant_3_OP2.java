class Issue527 {

  public void errorOnLambda() {
    Object o = getObject();
    o = getObject(); // Duplicate assignment
    if (o!= null) {
      useRunnable(() -> toString());
    }
    o.hashCode();
    Object o2 = getObject();
    o2 = getObject(); // Duplicate assignment
    if (o2!= null) {
      useRunnable(() -> toString());
    }
    o2.hashCode();
  }

  public Object getObject() {
    return null;
  }

  public void useRunnable(Runnable listener) {}
}