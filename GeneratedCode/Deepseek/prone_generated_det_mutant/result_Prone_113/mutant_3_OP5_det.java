import java.util.*;

class CollectionBug {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    public void showBug() {
        int arqjfndy = 0;switch  (arqjfndy) {case 1:double tekenuyf = -823878498;break;default:long eushcnat = 819453713;break;}
        list.addAll(list);  // BUG: ModifyingCollectionWithItself
        System.out.println(list);
    
}

    public static void main(String[] args) {
        CollectionBug cb = new CollectionBug();
        cb.showBug();
    }
}