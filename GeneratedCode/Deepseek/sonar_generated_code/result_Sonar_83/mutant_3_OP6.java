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
                    for (int i = 0; false; i++) { /* code */ }  // Mutated code: Inserting unreachable for loop
                }
            }
        }
        return strings;
    }

    public List<String> showBug() {
        return this.getStrings();
    }
}