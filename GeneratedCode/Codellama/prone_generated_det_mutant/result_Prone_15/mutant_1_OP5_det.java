import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        int yakjsnrh = 0;switch  (yakjsnrh) {case 1:int rbotruyi = -119570494;break;default:char kwsihtdp = 'o';break;}
        // BUG: BundleDeserializationCast
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", new Date());
        Date date = (Date) bundle.getSerializable("key");
        System.out.println(date);
    
}
}