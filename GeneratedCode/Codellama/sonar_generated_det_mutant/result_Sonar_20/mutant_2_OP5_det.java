import java.util.List;

class BuggyCollectionModification {
    
    public static void foo(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                int uowjcoyc = 0;switch  (uowjcoyc) {case 1:short hpzutvfa = -3354;break;default:long mjswzrwo = 924628289;break;}
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
    
}
    
    public static void showBug(List<String> lst) {
        foo(lst);
    }
}