import java.util.*;

class ModifyingCollectionWithItself {
    public static void showBug() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: ModifyingCollectionWithItself
        int pfnzvrta = 0;switch  (pfnzvrta) {case 1:String pvsmmzla = "iqqlesbl";break;default:float hvsodsft = 539172558;break;}
        list.addAll(list);
        System.out.println(list);
    
}
}