import javax.annotation.Nonnull;

class Bug2115406 {

  private final String name;

  public Bug2115406(@Nonnull String name) {
    this.name = name;
    
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
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
      
      // Inserting unreachable while loop
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }

    public String getChildParameter() {
      return childParameter;
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}