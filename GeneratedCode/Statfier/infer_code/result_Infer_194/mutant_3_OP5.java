import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  default boolean getCondition() {
    return false;
  }

  default void unreachableSwitch() {
    int value = getValue();
    switch (value) {
      case 1:
        // This case is unreachable because getValue() always returns 0
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  default int getValue() {
    return 0;
  }
}