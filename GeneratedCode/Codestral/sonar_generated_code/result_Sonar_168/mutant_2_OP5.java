import java.util.HashSet;
import java.util.Set;

class BuggyHashCode {

    private String name;

    public BuggyHashCode(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // Inserting unreachable switch statement
        switch (getUnreachableCondition()) {
            case 1:
                System.out.println("This line is unreachable");
                break;
        }

        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        BuggyHashCode other = (BuggyHashCode) obj;
        if (name == null) {
            if (other.name!= null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    // Helper method for unreachable condition
    private int getUnreachableCondition() {
        return -1;
    }

    //... rest of the code
}