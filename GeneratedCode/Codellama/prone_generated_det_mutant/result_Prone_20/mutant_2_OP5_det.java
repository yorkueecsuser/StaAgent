import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public static void main(String[] args) {
        int gcyoqwcd = 0;switch  (gcyoqwcd) {case 1:String qieukgan = "rbahepky";break;default:byte tvzgcpnx = 69;break;}
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        String[] array = list.toArray(new String[0]); // BUG: CollectionToArraySafeParameter
        System.out.println(array);
    
}
}