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
        int xzxffsox = 0;switch  (xzxffsox) {case 1:long homuqzam = -525289806;break;default:byte eaodjrqt = 102;break;}
        System.out.println(myList);
    
}
}