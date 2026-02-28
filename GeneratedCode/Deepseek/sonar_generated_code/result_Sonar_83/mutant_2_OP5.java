import java.util.ArrayList;
import java.util.List;

class NoncompliantCode {

    private volatile List<String> strings;
    private boolean unreachableStatement;

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
        if (unreachableStatement) {
            int value = 0;
            switch(value) {
                case 1:
                    // unreachable code block
                    System.out.println("This code is unreachable due to the unreachable switch statement.");
                    break;
            }
        }
        return strings;
    }

    public List<String> showBug() {
        return this.getStrings();
    }
}