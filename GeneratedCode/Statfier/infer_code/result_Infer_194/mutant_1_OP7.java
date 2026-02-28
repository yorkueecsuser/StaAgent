import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  // Introduced unreachable while loop as per mutation operator
  default void unreachableLoop() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the loop unreachable
  }
}