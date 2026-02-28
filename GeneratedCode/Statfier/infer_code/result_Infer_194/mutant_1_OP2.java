import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  default void dummyMethod() {
    int dummyVar = 0; // Introducing a dummy variable
    dummyVar = dummyVar; // Duplicating the assignment statement
  }
}