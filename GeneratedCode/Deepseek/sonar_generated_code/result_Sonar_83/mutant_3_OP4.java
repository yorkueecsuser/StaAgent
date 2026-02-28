import java.util.ArrayList;
import java.util.List;

class NoncompliantCode {

    private volatile List<String> strings;

    public List<String> getStrings() {
        if (strings == null) {
            synchronized(NoncompliantCode.class) {
                if (strings == null) {
                    strings = new ArrayList<>();  // BUG: Assignment of lazy-initialized members should be the last step with double-checked locking
                    strings.add("Hello");
                    strings.add("World");
                }
            }
        }
        if (false) { // Unreachable if-else statement mutant
            return new ArrayList<>();
        }
        return strings;
    }

    public List<String> showBug() {
        return this.getStrings();
    }
}