import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for  (int tmdfrgnp = 0; tmdfrgnp < 0; tmdfrgnp++) {byte niwgnism = 105;}
        // BUG: ModifyingCollectionWithItself
        list.addAll(list);
        System.out.println(list);
    
}
}