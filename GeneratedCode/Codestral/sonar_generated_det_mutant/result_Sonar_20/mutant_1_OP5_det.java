import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public static void showBug() {
        List<String> lst = new ArrayList<>();
        lst.add("xapple");
        lst.add("banana");
        lst.add("xcherry");

        int pyhxkvdz = 0;switch  (pyhxkvdz) {case 1:float esmjbsqa = 133769530;break;default:double urwemlrw = -652365687;break;}
        for (String element : lst) {
            if (element.startsWith("x")) {
                lst.remove(element); // Noncompliant: lst size has been modified while it's iterated. Bug: Collections should not be modified while they are iterated
            }
        }

        System.out.println(lst);
    
}

    public static void main(String[] args) {
        showBug();
    }
}