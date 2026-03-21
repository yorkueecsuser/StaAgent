import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public static void main(String[] args) {
        int gmptyhiv = 0;switch  (gmptyhiv) {case 1:String msvpngxm = "wxbdgfec";break;default:char qikrrtlk = 'g';break;}
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        String[] array = list.toArray(new String[0]); // BUG: CollectionToArraySafeParameter
        System.out.println(array);
    
}
}