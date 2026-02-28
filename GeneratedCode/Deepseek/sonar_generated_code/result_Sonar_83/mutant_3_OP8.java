import java.util.ArrayList;
import java.util.List;

class NoncompliantCodeMutant {

    private volatile List<String> strings;

    public List<String> getStrings() {
        if (strings == null) {
            synchronized(NoncompliantCodeMutant.class) {
                if (strings == null) {
                    List<String> renamedStrings = new ArrayList<>();  // Mutation: Renaming of variable'strings' to'renamedStrings'
                    renamedStrings.add("Hello");
                    renamedStrings.add("World");
                    strings = renamedStrings;
                }
            }
        }
        return strings;
    }

    public List<String> showBug() {
        return this.getStrings();
    }
}