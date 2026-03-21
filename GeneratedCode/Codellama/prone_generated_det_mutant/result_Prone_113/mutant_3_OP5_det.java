import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        int usihchmt = 0;switch  (usihchmt) {case 1:long ewjobzxx = 552851081;break;default:short pxdaodkm = -9158;break;}
        // BUG: ModifyingCollectionWithItself
        list.addAll(list);
        System.out.println(list);
    
}
}