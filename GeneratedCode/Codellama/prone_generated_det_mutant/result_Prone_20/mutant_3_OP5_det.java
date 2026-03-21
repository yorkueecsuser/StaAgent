import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        int nsqdzzvu = 0;switch  (nsqdzzvu) {case 1:float iwvrnufp = -539180285;break;default:byte ehwwpxdm = -53;break;}
        String[] array = list.toArray(new String[0]); // BUG: CollectionToArraySafeParameter
        System.out.println(array);
    
}
}