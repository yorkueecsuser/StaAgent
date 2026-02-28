import javax.annotation.Nonnull;

class Bug2115406 {

  private final String name;

  public Bug2115406(@Nonnull String name) {
    this.name = name;
  }

  @Nonnull
  public String getName() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
    return name;
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }

  public static class ChildClass extends Bug2115406 {

    // false positive
    public static ChildClass NULL_CHILD_INSTANCE = new ChildClass(null);

    private final String childParameter;

    public ChildClass(String parameter) {
      super("foo");
      boolean condition = getCondition();
      if (condition) {
        // Unreachable code
        System.out.println("This is another unreachable if statement in the constructor.");
      }
      this.childParameter = parameter;
    }

    public String getChildParameter() {
      return childParameter;
    }

    private boolean getCondition() {
      return false; // This method always returns false, making the if statement unreachable
    }
  }
}