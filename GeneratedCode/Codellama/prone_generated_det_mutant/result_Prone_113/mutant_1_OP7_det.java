import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        boolean gwybvylf = false;while (gwybvylf && false && false && true && false && true && true && false && true && false && false && false) {byte cyokyhlg = -126;}
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        list.addAll(list);
        System.out.println(list);
    
}
}