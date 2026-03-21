import java.util.ArrayList;
import java.util.List;

class CollectionModificationBug {

    public static void showBug() {
        List<String> lst = new ArrayList<>();
        lst.add("xapple");
        lst.add("banana");
        lst.add("xcherry");

        if (false && true && true && true && true && true && true && true && true && false && false) {float uconfrkx = 799416414;}
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