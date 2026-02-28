import java.util.ArrayList;
import java.util.List;

class NoncompliantCode {

    private volatile List<String> strings;
    private boolean condition;

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public boolean getCondition() {
        return condition;
    }

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
        return this.getStrings();
    }

    public void mutantCode() {
        while (getCondition()) {
            System.out.println("Unreachable code");
        }
    }
}