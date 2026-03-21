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
        boolean plvifbny = false;while (plvifbny && true && false && true && false && true && false && true && false && false && false && false) {long zgxughzu = -597341198;}
        System.out.println(myList);
    
}
}