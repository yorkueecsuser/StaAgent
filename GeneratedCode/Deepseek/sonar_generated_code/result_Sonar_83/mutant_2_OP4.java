import java.util.ArrayList;
import java.util.List;

class NoncompliantCode {

    private volatile List<String> strings;

    // Added part start
    private boolean condition;
    // Added part end

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
        return strings;
    }

    public List<String> showBug() {
        // Added part start
        condition = true;
        // Added part end
        return this.getStrings();
    }
}