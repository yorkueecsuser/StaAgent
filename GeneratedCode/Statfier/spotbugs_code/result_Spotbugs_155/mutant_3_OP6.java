import javax.annotation.CheckForNull;

class Issue20 {

  /**
   * @return may be null
   */
  @CheckForNull
  public static String methodThatMightReturnNull() {
    if (Boolean.getBoolean("test")) {
      return null;
    }

    return "test";
  }

  public void testNPLambda() {
    Runnable lambda =
        () -> {
          String maybeNull = methodThatMightReturnNull();

          // would expect findbugs warning about possible null dereferencing here
          boolean empty = maybeNull.isEmpty();
          System.out.println(empty);

          // Inserting unreachable for loop
          boolean conditionFor = getCondition();
          for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because getCondition() will always return false
            System.out.println("This loop is unreachable");
          }
        };
    lambda.run();
  }

  private boolean getCondition() {
    return false;
  }
}