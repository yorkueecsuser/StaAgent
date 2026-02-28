import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  // Added mutant code
  default boolean getCondition() {
    return false;
  }

  default void someMethod() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run because shouldRun is always false
      System.out.println("This will never be printed.");
    } else {
      // Alternative code that will always run
      System.out.println("This will always be printed.");
    }
  }
}