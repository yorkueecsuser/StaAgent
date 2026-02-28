import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  // Introduced an unreachable for loop according to the mutation operator
  default void unreachableLoop() {
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getConditionForLoop() always returns false
    }
  }

  private boolean getConditionForLoop() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}