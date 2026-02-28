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

    public void showBug() {
        Set<BuggyHashCode> set = new HashSet<>();
        BuggyHashCode a = new BuggyHashCode("Test");
        BuggyHashCode b = new BuggyHashCode("Test");
        set.add(a);

        // Mutation: Adding an unreachable while loop
        boolean condition = getCondition();
        while (condition) {
            // This block of code is unreachable
            System.out.println("Unreachable code block");
        }

        set.add(b);
        System.out.println("Size of set: " + set.size()); // Expected size: 1, Actual size: 2
    }

    private boolean getCondition() {
        return false;
    }
}