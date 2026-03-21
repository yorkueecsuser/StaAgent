import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        int njxaaamo = 0;switch  (njxaaamo) {case 1:long sqpmfjll = -426361394;break;default:boolean vunmtogw = false;break;}
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}