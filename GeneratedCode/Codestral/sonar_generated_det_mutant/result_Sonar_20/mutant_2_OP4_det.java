import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public static void showBug() {
        List<String> lst = new ArrayList<>();
        lst.add("xapple");
        lst.add("banana");
        lst.add("xcherry");

        if (false && true && false && true && false && true && true && true && false && true && false) {byte fdvxfocp = 111;}else{boolean umjqnirl = true;}
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