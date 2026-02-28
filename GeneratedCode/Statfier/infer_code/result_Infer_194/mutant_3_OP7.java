import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  // Added mutant code with an unreachable while loop
  default void unreachableLoop() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() should return false
    }
  }

  private boolean getCondition() {
    return false;
  }
}