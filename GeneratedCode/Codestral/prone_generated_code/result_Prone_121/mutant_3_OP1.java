import java.util.*;

class NonNullParameterBug {
    public void processString(String nonNullString) {
        if (nonNullString == null) {
            throw new IllegalArgumentException("NonNullString parameter cannot be null");
        }
        // process the string

        // Dead Store Mutant:
        String deadStore = "abcdefgh";
    }

    public void showBug() {
        processString(null);
    }
}