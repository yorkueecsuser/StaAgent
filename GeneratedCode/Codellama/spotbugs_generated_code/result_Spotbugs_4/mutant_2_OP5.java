import java.util.ArrayList;
import java.util.List;

class UnresolvableReferenceBug {
    private List<String> myList = new ArrayList<String>();

    public UnresolvableReferenceBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        myList.add("Hello");
        myList.add("World");
    }

    public List<String> getMyList() {
        return myList;
    }

    public void showBug() {
        System.out.println(myList);
    }

    // Unreachable switch statement mutation operator
    public void unreachableSwitchStatement() {
        // Insert an unreachable switch statement into a randomly selected basic block
        boolean shouldRun = getCondition(); // Use a non-final variable or an equivalent method call
        if (shouldRun) {
            int value = getValue(); // Use a non-final variable or an equivalent method call
            switch (value) {
                case 1:
                    // Code that will never be executed
                    System.out.println("This code is unreachable!");
                    break;
                default:
                    // Default code that will always be executed
                    System.out.println("This code is reachable!");
                    break;
            }
        } else {
            // Default code that will always be executed
            System.out.println("This code is reachable!");
        }
    }
}