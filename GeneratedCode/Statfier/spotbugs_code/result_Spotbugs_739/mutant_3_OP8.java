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
    }

    public String getChildParameter() {
      return childParameter;
    }

    // Mutated code
    private final String z;

    public ChildClass(String x) {
      super("foo");

      this.z = x;
    }

    public String getZ() {
      return z;
    }
  }
}