import javax.annotation.Nonnull;

class Bug2115406 {

  private final String name;

  public Bug2115406(@Nonnull String name) {
    this.name = name;
  }

  @Nonnull
  public String getName() {
    return name;
  }

  public static class ChildClass extends Bug2115406 {

    // false positive
    public static ChildClass NULL_CHILD_INSTANCE = new ChildClass(null);

    private final String childParameter;

    public ChildClass(String parameter) {
      super("foo");

      this.childParameter = parameter;

      // Introduced unreachable if-else statement
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This will never run because shouldRun is always false.");
      } else {
        System.out.println("This will also never run because shouldRun is always false.");
      }
    }

    public String getChildParameter() {
      return childParameter;
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
      return false;
    }
  }
}