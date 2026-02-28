import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID

    public Bug(String name) {
        this.name = name;
    }

    public String showBug() {
        boolean unreachableWhile = false;
        while(unreachableWhile) {
            // Unreachable Statement
            int unreachableInt = 0;
            unreachableInt += 1;
        }
        return name;
    }
}