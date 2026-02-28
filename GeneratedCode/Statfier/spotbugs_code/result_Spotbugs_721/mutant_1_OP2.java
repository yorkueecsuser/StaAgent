class NullDeref7 {

  private void alwaysThrow() {
    throw new RuntimeException("Oops");
  }

  private void throwIfNull(Object o) {
    if (o == null) throw new RuntimeException("Got a null pointer");
  }

  public void foo(Object o) {
    if (o == null) {
      alwaysThrow();
      if (o == null) alwaysThrow(); // Duplicate of the null check and method call
    }
    System.out.println(o.hashCode());
  }

  public void bar(Object o) {
    if (o == null) {
      throwIfNull(o);
      if (o == null) throwIfNull(o); // Duplicate of the null check and method call
    }
    System.out.println(o.hashCode());
  }
}