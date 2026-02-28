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

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("This line is unreachable");
        } else {
            // This code is also unreachable
            System.out.println("This line is also unreachable");
        }

        return true;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the inserted branch unreachable
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