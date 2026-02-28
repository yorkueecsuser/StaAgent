import java.util.HashSet;
import java.util.Set;

class BuggyHashCode {

    private String name;

    public BuggyHashCode(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;

        // Mutant: Unreachable if statement
        if (getUnreachableCondition()) {
            // This branch will never be executed
            throw new IllegalStateException("Unreachable code executed");
        }

        BuggyHashCode other = (BuggyHashCode) obj;
        if (name == null) {
            if (other.name!= null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    // Helper method to return unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    //... rest of the code...
}