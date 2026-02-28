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

    public void addUnreachableForLoop() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // An unreachable block for the mutation operator
        }
    }
}