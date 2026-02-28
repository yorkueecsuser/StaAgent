import javax.annotation.Nonnull;

class Bug2115406 {

  private final String name;

  public Bug2115406(@Nonnull String name) {
    this.name = name;
  }

  @Nonnull
  public String getName() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable else branch
      System.out.println("This is an unreachable else branch.");
    }
    return name;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }

  public static class ChildClass extends Bug2115406 {

    // false positive
    public static ChildClass NULL_CHILD_INSTANCE = new ChildClass(null);

    private final String childParameter;

    public ChildClass(String parameter) {
      super("foo");

      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in ChildClass constructor.");
      }

      this.childParameter = parameter;
    }

    public String getChildParameter() {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable else branch
        System.out.println("This is an unreachable else branch in getChildParameter.");
      }
      return childParameter;
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is dynamically determined at runtime
    }
  }
}