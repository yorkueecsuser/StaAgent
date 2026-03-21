import java.util.*;

class CollectionBug {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    public void showBug() {
        if (true && false && true && false && false && false && true && true && false && false && false) {double qwuwkopk = -517575288;}
        list.addAll(list);  // BUG: ModifyingCollectionWithItself
        System.out.println(list);
    
}

    public static void main(String[] args) {
        CollectionBug cb = new CollectionBug();
        cb.showBug();
    }
}