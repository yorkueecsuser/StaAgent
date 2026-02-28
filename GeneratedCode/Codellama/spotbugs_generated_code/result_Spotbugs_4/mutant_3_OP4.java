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
}

class UnreachableIfElseMutant{
    private List<String> myList = new ArrayList<String>();

    public UnreachableIfElseMutant() {
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

    public void runMutant() {
        // Unreachable if-else statement
        boolean unreachable = false;
        if (unreachable) {
            // Code that can never be executed
        } else {
            // Code that can be executed
        }
    }
}