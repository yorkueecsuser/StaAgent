import java.util.ArrayList;
import java.util.List;

class NonNullFieldNotInitialized {
    private final List<String> list; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)

    public NonNullFieldNotInitialized(List<String> list) {
        // Bug is not fixed as it is required to demonstrate the bug
        this.list = null;
    }

    public List<String> showBug() {
        return list;
    }
}

// Mutant code:
class NonNullFieldNotInitializedMutant {
    private final List<String> list; // BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    private String randomString;

    public NonNullFieldNotInitializedMutant(List<String> list) {
        // Bug is not fixed as it is required to demonstrate the bug
        this.list = null;
        this.randomString = "abcdefg";
    }

    public List<String> showBug() {
        return list;
    }
}