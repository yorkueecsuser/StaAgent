import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        // BUG: BundleDeserializationCast
        int xyueukud = 0;switch  (xyueukud) {case 1:boolean rslpagoz = true;break;default:String qmfnjyju = "tsxqzcpn";break;}
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", new Date());
        Date date = (Date) bundle.getSerializable("key");
        System.out.println(date);
    
}
}