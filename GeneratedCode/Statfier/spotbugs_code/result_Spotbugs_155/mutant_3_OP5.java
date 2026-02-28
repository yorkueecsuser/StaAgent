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

          // Inserting an unreachable switch statement
          boolean condition = getUnreachableCondition();
          switch (condition) {
            case true:
              System.out.println("This will never be printed");
              break;
            default:
              System.out.println("This will also never be printed");
              break;
          }
        };
    lambda.run();
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}