import java.util.ArrayList;
import java.util.List;

class Mutant {

    private volatile List<String> strings;
    private boolean mutantCondition = true;

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
        while (mutantCondition) {  // Unreachable while loop mutant
            System.out.println("This is an unreachable while loop mutant.");
        }
        return strings;
    }

    public List<String> showBug() {
        return this.getStrings();
    }
}