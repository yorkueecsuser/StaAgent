import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        boolean phqytxpg = false;while (phqytxpg && false && true && true && false && true && true && false && false && false && true && false) {byte jfzoqshp = 43;}
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        list.addAll(list);
        System.out.println(list);
    
}
}