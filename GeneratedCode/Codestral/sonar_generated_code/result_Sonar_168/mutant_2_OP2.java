import java.util.HashSet;
import java.util.Set;

class BuggyHashCode {

    private String name;

    public BuggyHashCode(String name) {
        this.name = name;
        // Mutant: Duplication of the assignment statement
        this.name = name;
    }

    // The rest of the code remains the same

    //...
}