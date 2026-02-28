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
      // This is an unreachable if statement
      System.out.println("This is an unreachable statement");
    }
    return name;
  }

  private boolean getCondition() {
    return false;
  }

  public static class ChildClass extends Bug2115406 {

    // false positive
    public static ChildClass NULL_CHILD_INSTANCE = new ChildClass(null);

    private final String childParameter;

    public ChildClass(String parameter) {
      super("foo");

      this.childParameter = parameter;
    }

    public String getChildParameter() {
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement
        System.out.println("This is another unreachable statement");
      }
      return childParameter;
    }

    private boolean getCondition() {
      return false;
    }
  }
}