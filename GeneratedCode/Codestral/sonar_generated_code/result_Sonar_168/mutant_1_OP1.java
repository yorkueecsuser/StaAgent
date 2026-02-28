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
        return true;
    }

    @Override
    public int hashCode() {
        return name!= null? name.hashCode() : 0;
    }

    public void showBug() {
        Set<BuggyHashCode> set = new HashSet<>();
        BuggyHashCode a = new BuggyHashCode("Test");
        BuggyHashCode b = new BuggyHashCode("Test");
        // Dead Store Mutant: Unused variable declaration
        int unusedVariable = 10;
        set.add(a);
        set.add(b);
        System.out.println("Size of set: " + set.size()); // Expected size: 1, Actual size: 2
    }
}