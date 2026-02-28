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

    // Generated Mutation: Unreachable for loop
    boolean conditionFor;
    for (int i = 0; conditionFor; i++) {
        // Unreachable code block
        System.out.println("This code is unreachable.");
    }
}