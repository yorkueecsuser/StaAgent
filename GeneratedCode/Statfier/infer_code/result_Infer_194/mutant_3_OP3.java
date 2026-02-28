import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  // Added mutant code with an unreachable if statement
  default void mutantMethod() {
    boolean condition = getCondition();
    if (condition) {
      // This block is reachable
      System.out.println("This is a reachable block.");
    }
    // Unreachable if statement
    if (!condition && condition) {
      // This block is unreachable
      System.out.println("This is an unreachable block.");
    }
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return true;
  }
}