import java.util.ArrayList;
import java.util.List;

class UnresolvableReferenceBug {
    private List<String> myList = new ArrayList<String>();

    public UnresolvableReferenceBug() {
        // BUG: VR: Class makes reference to unresolvable class or method (VR_UNRESOLVABLE_REFERENCE)
        myList.add("Hello");
        myList.add("World");
        myList.add("Hello"); // Duplicated line
        myList.add("World"); // Duplicated line
    }

    public List<String> getMyList() {
        return myList;
    }

    public void showBug() {
        System.out.println(myList);
    }
}