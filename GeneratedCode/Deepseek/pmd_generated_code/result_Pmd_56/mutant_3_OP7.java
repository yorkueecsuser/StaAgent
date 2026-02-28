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

    // Unreachable while loop mutant
    {
        boolean condition = getCondition();
        while (condition) {
            // Unreachable code
            String unreachable = "This code is unreachable";
        }
    }
}