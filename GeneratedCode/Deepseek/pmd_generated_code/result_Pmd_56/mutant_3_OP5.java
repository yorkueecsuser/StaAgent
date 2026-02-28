import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        this.name = name;
    }

    public String showBug() {
        return name;
    }

    // Mutant code:
    public void addMutant() {
        switch(0) {
            default:
                break;
        }
    }
}