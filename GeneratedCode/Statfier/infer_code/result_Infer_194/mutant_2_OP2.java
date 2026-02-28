import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  // Hypothetical method added for demonstration purposes
  default void hypotheticalMethod() {
    int x = 5; // Assignment statement to duplicate
    int y = 10; // Another assignment statement to demonstrate non-duplication
    x = x + y; // This is not a simple assignment, so it won't be duplicated
  }

  // Duplicate of the assignment statement x = 5;
  default void hypotheticalMethodWithDuplication() {
    int x = 5; // Original assignment statement
    int x_duplicate = 5; // Duplicated assignment statement
    int y = 10;
    x = x + y;
  }
}