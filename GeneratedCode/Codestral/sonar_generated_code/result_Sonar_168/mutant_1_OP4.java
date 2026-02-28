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
        BuggyHashCode other = (BuggyHashCode) obj;
        if (name == null) {
            if (other.name!= null)
                return false;
        } else if (!name.equals(other.name))
            return false;

        // Unreachable if-else statement mutation
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable
            System.out.println("Unreachable code executed!");
        } else {
            // This branch is also unreachable
            System.out.println("Another unreachable code executed!");
        }

        return true;
    }

    // BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
    // The hashCode() method is not overridden, causing a violation of the contract between equals() and hashCode()

    // Method to get an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        Set<BuggyHashCode> set = new HashSet<>();
        BuggyHashCode a = new BuggyHashCode("Test");
        BuggyHashCode b = new BuggyHashCode("Test");
        set.add(a);
        set.add(b);
        System.out.println("Size of set: " + set.size()); // Expected size: 1, Actual size: 2
    }
}