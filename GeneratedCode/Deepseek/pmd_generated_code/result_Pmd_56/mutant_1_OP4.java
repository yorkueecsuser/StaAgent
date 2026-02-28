import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        this.name = name;
    }

    public String showBug() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            return name;
        } else {
            // Unreachable code
            return "Unreachable";
        }
    }

    private boolean getCondition() {
        // Always returns true, making the if-else condition always reachable
        return true;
    }
}