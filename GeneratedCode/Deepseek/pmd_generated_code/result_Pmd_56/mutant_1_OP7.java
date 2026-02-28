import java.io.Serializable;

class Bug implements Serializable {
    String name;
    // BUG: MissingSerialVersionUID
    boolean conditionWhile = true;

    public Bug(String name) {
        this.name = name;
    }

    public String showBug() {
        return name;
    }

    public void unreachableWhileLoop() {
        while (conditionWhile) {
            // Code that will never execute
        }
    }
}