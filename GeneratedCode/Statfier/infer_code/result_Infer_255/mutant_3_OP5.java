public enum ResType {
  SOME,
  NONE;

  // Added mutant code to introduce an unreachable switch statement
  public void dummyMethod() {
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable code.");
        break;
      default:
        System.out.println("This is also unreachable code.");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}