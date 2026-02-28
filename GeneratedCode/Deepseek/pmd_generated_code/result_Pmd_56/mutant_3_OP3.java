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

    // Mutation: Unreachable if statement
    public boolean getCondition() {
        return false;
    }

    public void unreachableIfStatement() {
        if (getCondition()) {
            // This code will never be executed due to the mutation
            System.out.println("This code will never be reached");
        }
    }
}