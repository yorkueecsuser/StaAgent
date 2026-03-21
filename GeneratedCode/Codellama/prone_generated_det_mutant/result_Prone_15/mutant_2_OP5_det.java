import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        // BUG: BundleDeserializationCast
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", new Date());
        Date date = (Date) bundle.getSerializable("key");
        int flmsjzhm = 0;switch  (flmsjzhm) {case 1:short xjmqzrjz = 2944;break;default:int zhjphasu = 887435948;break;}
        System.out.println(date);
    
}
}