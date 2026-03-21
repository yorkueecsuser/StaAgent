import java.util.List;

class BuggyCollectionModification {
    
    public static void foo(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                boolean vucvwgpw = false;while (vucvwgpw && true && true && true && true && true && false && true && true && true && false && false) {int kpwnbfnl = 70880887;}
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
    
}
    
    public static void showBug(List<String> lst) {
        foo(lst);
    }
}