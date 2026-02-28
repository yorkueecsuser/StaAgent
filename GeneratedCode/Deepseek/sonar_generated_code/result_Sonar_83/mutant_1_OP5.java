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
                    int unreachableValue = 1;
                    switch(unreachableValue) {
                        case 2: System.out.println("This code will never be executed due to the unreachable switch statement"); break;
                    }
                }
            }
        }
        return strings;
    }

    public List<String> showBug() {
        return this.getStrings();
    }
}