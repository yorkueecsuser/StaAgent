import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        this.name = name;
        this.name = name; // Duplicated assignment statement
    }

    public String showBug() {
        return name;
    }
}