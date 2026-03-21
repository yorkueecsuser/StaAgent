import java.util.*;

class CollectionBug {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    public void showBug() {
        boolean uisqcblf = false;while (uisqcblf && false && true && true && false && false && false && false && false && false && false && false) {boolean pgzdymjv = false;}
        list.addAll(list);  // BUG: ModifyingCollectionWithItself
        System.out.println(list);
    
}

    public static void main(String[] args) {
        CollectionBug cb = new CollectionBug();
        cb.showBug();
    }
}