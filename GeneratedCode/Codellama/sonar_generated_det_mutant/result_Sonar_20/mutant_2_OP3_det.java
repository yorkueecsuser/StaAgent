import java.util.List;

class BuggyCollectionModification {
    
    public static void foo(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                if (true && true && false && true && false && false && true && true && true && false && false) {double ounqvtjx = 323045842;}
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
    
}
    
    public static void showBug(List<String> lst) {
        foo(lst);
    }
}