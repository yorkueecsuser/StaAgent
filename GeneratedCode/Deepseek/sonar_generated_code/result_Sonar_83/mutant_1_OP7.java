import java.util.ArrayList;
import java.util.List;

class NoncompliantCode {

    private volatile List<String> strings;

    public List<String> getStrings() {
        if (strings == null) {
            synchronized(NoncompliantCode.class) {
                if (strings == null) {
                    strings = new ArrayList<>();
                    strings.add("Hello");
                    strings.add("World");
                }
            }
        }
        boolean condition = false;
        while (condition) {
            // This while loop will never be executed because the condition is always false
        }
        return strings;
    }

    public List<String> showBug() {
        return this.getStrings();
    }
}