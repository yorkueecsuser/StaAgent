import java.io.Serializable;

class Bug implements Serializable {
    String bugName; // Renamed variable from 'name' to 'bugName'
    // BUG: MissingSerialVersionUID

    public Bug(String bugName) { // Changed parameter name in constructor from 'name' to 'bugName'
        this.bugName = bugName;
    }

    public String showBug() {
        return bugName; // Usage of renamed variable 'bugName'
    }
}