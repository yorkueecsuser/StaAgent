class CloneIdiom3 implements Cloneable {
  @Override
  public Object clone() {
    // Introducing an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case is also unreachable due to the nature of alwaysFalse
        System.out.println("This will also never be printed");
        break;
    }

    return new CloneIdiom3();
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}