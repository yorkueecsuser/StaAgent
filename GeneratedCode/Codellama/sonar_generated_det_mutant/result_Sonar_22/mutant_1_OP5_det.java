import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        int svrwyvnu = 0;switch  (svrwyvnu) {case 1:boolean ttjcmgpx = false;break;default:long yrzpbzec = -558256327;break;}
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}