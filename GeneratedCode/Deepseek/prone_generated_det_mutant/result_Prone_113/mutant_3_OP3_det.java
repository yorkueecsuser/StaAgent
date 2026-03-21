import java.util.*;

class CollectionBug {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    public void showBug() {
        if (false && false && true && false && true && false && true && false && false && true && false) {byte jxvzuilw = 104;}
        list.addAll(list);  // BUG: ModifyingCollectionWithItself
        System.out.println(list);
    
}

    public static void main(String[] args) {
        CollectionBug cb = new CollectionBug();
        cb.showBug();
    }
}