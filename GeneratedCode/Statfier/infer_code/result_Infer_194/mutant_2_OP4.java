import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  // Mutant code added below
  default boolean getCondition() {
    return false;
  }

  default void unreachableIfElse() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that will never run
      System.out.println("This is reachable code.");
    } else {
      // Unreachable code due to the condition always being false
      System.out.println("This is unreachable code.");
    }
  }
}