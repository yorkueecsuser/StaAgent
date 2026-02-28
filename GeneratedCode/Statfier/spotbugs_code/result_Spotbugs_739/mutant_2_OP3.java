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

      // Introduced unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable statement.");
      }
    }

    public String getChildParameter() {
      return childParameter;
    }

    private boolean getCondition() {
      return false; // This method always returns false, ensuring the if block is unreachable
    }
  }
}