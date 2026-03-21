import java.util.List;

class BuggyCollectionModification {
    
    public static void foo(List<String> lst) {
        for (String element : lst) {
            if (element.startsWith("x")) {
                int russigrx = 0;switch  (russigrx) {case 1:char rammmbky = 'h';break;default:String rnfvrhxc = "zrouvfdm";break;}
                lst.remove(element); // BUG: Collections should not be modified while they are iterated
            }
        }
    
}
    
    public static void showBug(List<String> lst) {
        foo(lst);
    }
}