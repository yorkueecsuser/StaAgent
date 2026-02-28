class Issue527 {

  public void errorOnLambda() {
    Object o = getObject();
    Object o_duplicate = getObject(); // Added duplicate assignment
    if (o!= null) {
      useRunnable(() -> toString());
    }
    o.hashCode();
    Object o2 = getObject();
    Object o2_duplicate = getObject(); // Added duplicate assignment
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