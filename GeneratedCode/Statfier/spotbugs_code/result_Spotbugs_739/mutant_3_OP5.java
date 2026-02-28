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

      // Introduced unreachable switch statement
      boolean condition = getCondition();
      switch (condition? 0 : 1) {
        case 0:
          // This case will never be executed because condition is always false
          System.out.println("This is an unreachable case");
          break;
        case 1:
          // This case will always be executed
          System.out.println("This is the reachable case");
          break;
      }
    }

    public String getChildParameter() {
      return childParameter;
    }

    private boolean getCondition() {
      // Always returns false to ensure the switch statement is mostly unreachable
      return false;
    }
  }
}