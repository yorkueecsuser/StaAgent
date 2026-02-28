import java.io.Serializable;

class Bug implements Serializable {
    String bugName; // Mutated line
    // BUG: MissingSerialVersionUID

    public Bug(String bugName) { // Mutated line
        this.bugName = bugName;
    }

    public String showBug() {
        return bugName;
    }
}