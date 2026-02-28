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

    // Unreachable IF-ELSE Statement Mutation
    public void unreachableIfElseMutation() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This code should be reachable");
        } else {
            // This branch is unreachable
            System.out.println("This code should be unreachable");
        }
    }

    // Helper method to get condition dynamically
    public boolean getCondition() {
        return false;
    }
}