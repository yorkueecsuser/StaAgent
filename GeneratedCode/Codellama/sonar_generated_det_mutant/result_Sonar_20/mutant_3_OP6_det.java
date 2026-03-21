import java.util.List;

class BuggyCollectionModification {
    
    public static void foo(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                for  (int xtyaolft = 0; xtyaolft < 0; xtyaolft++) {float myxjnycq = 828582818;}
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
    
}
    
    public static void showBug(List<String> lst) {
        foo(lst);
    }
}