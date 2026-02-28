import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  // Mutant code added according to the mutation operator description
  default void mutantMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that might run if condition is true
    } else {
      // Unreachable if-else branch
      System.out.println("This is an unreachable else block.");
    }
  }

  private boolean getCondition() {
    // This method ensures the condition is dynamically determined at runtime
    return false;
  }
}