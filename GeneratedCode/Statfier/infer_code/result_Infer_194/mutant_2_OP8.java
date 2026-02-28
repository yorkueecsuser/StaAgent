import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  // Introduced a new method with a user-defined variable for mutation purposes
  default void exampleMethod() {
    String originalVariable = "example";
    System.out.println(originalVariable);
  }

  // Mutant: Renamed 'originalVariable' to 'a'
  default void exampleMethodMutant() {
    String a = "example";
    System.out.println(a);
  }
}