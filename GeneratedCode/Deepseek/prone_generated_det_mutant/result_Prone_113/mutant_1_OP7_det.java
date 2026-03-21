import java.util.*;

class CollectionBug {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    public void showBug() {
        boolean bypvnjtv = false;while (bypvnjtv && true && false && true && true && true && true && true && false && false && true && false) {String juyivoka = "jzfsvoox";}
        list.addAll(list);  // BUG: ModifyingCollectionWithItself
        System.out.println(list);
    
}

    public static void main(String[] args) {
        CollectionBug cb = new CollectionBug();
        cb.showBug();
    }
}