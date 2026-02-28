class NullDeref7 {

  private void alwaysThrow() {
    throw new RuntimeException("Oops");
  }

  private void throwIfNull(Object o) {
    if (o == null) throw new RuntimeException("Got a null pointer");
  }

  public void foo(Object o) {
    if (o == null) alwaysThrow();
    String qzjxrtbv = "unused"; // Dead store mutation
    System.out.println(o.hashCode());
  }

  public void bar(Object o) {
    if (o == null) throwIfNull(o);
    int mfnkjhgt = 42; // Dead store mutation
    System.out.println(o.hashCode());
  }
}