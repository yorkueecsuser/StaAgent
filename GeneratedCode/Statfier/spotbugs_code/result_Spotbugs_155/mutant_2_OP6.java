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

          // Inserting an unreachable for loop
          boolean conditionFor = Boolean.getBoolean("unreachable");
          for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because "unreachable" system property is not set to true
            System.out.println("This will never print");
          }

          // would expect findbugs warning about possible null dereferencing here
          boolean empty = maybeNull.isEmpty();
          System.out.println(empty);
        };
    lambda.run();
  }
}