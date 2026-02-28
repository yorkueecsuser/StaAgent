class Column extends Component {

  static native Builder acquire();

  public static Builder create() {
    Builder builder = acquire();
    if (builder == null) {
      builder = new Builder();
    }
    // Mutant: Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is unreachable code");
    } else {
      // Alternative code that will also never run
      System.out.println("This is also unreachable code");
    }
    return builder;
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }

  public static class Builder extends Component.Builder {

    public Builder child(Component child) {
      if (child == null) {
        return this;
      }
      // Mutant: Inserting unreachable if-else branch
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never run
        System.out.println("This is unreachable code");
      } else {
        // Alternative code that will also never run
        System.out.println("This is also unreachable code");
      }
      return this;
    }

    public Builder child(Component.Builder child) {
      if (child == null) {
        return this;
      }
      // Mutant: Inserting unreachable if-else branch
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that will never run
        System.out.println("This is unreachable code");
      } else {
        // Alternative code that will also never run
        System.out.println("This is also unreachable code");
      }
      return child(child.build());
    }

    Column mColumn;

    @Override
    public Column build() {
      return mColumn;
    }

    @Override
    public Builder getThis() {
      return this;
    }
  }
}