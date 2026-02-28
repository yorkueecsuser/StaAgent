class MyClass {
  private String _a;
  private String _b;

  public void doSomethingSynchronized() {
    synchronized (_a) {  // Mutation: Renaming 'this.getClass()' to '_a'
      //...
    }
  }

  public void showBug() {
    synchronized (_b) {  // Mutation: Renaming 'this.getClass()' to '_b'
      //...
    }
  }
}