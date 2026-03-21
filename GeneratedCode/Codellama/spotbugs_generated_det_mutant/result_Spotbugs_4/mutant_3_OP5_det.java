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
        int sjtdfjni = 0;switch  (sjtdfjni) {case 1:String xxaavadn = "dxhelrhq";break;default:short zdvukyht = -1687;break;}
        System.out.println(myList);
    
}
}