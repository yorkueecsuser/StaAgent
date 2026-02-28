class Issue527 {

  public void errorOnLambda() {
    Object o = getObject();
    if (o!= null) {
      useRunnable(() -> toString());
    }
    o.hashCode();
    Object o2 = getObject();
    if (o2!= null) {
      useRunnable(() -> toString());
    }
    o2.hashCode();

    // Mutant code
    Object x = getObject();
    if (x!= null) {
      useRunnable(() -> toString());
    }
    x.hashCode();
    Object y = getObject();
    if (y!= null) {
      useRunnable(() -> toString());
    }
    y.hashCode();
  }

  public Object getObject() {
    return null;
  }

  public void useRunnable(Runnable listener) {}
}