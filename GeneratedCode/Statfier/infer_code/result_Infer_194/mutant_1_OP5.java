import javax.annotation.Nullable;

@GeneratedGraphQL
public interface ServerSideDeserializer {

  public @Nullable Object nullableGetter();

  default boolean getCondition() {
    return false;
  }

  default int getValue() {
    return 0;
  }

  default void unreachableSwitch() {
    int value = getValue();
    switch (value) {
      case 1:
        // Unreachable case since getValue() always returns 0
        System.out.println("This is unreachable");
        break;
      default:
        // This will be executed
        System.out.println("Default case executed");
        break;
    }
  }
}