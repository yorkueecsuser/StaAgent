import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  // Introduced an unreachable while loop according to the mutation operator
  default void introduceUnreachableLoop() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() should return false
    }
  }

  private boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}