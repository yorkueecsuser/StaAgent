import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        this.name = name; // duplicate original assignment statement
        this.name = name; // insert new assignment statement
    }

    public String showBug() {
        return name;
    }
}