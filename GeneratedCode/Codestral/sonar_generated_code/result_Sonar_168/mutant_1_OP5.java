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

    // Added unreachable switch statement
    private void unreachableSwitch() {
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                System.out.println("This should not be printed.");
                break;
            default:
                // Do nothing
        }
    }

    private int getUnreachableValue() {
        return 2; // This value is not covered by any case in the switch statement
    }

    public void showBug() {
        Set<BuggyHashCode> set = new HashSet<>();
        BuggyHashCode a = new BuggyHashCode("Test");
        BuggyHashCode b = new BuggyHashCode("Test");
        set.add(a);
        set.add(b);
        // Call the unreachable switch statement
        unreachableSwitch();
        System.out.println("Size of set: " + set.size()); // Expected size: 1, Actual size: 2
    }
}