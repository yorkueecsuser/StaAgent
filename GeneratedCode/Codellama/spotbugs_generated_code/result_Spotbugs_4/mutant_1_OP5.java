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

    // Unreachable switch statement mutant
    public void unreachableSwitchStatement(int value) {
        switch (value) {
            case 0:
                myList.add("Zero");
                break;
            case 1:
                myList.add("One");
                break;
            default:
                myList.add("Default");
                break;
        }
    }
}