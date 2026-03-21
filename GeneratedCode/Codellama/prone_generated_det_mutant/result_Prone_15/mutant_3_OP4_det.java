import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        // BUG: BundleDeserializationCast
        Bundle bundle = new Bundle();
        if (false && true && false && false && false && false && false && false && false && false && false) {short esxkdnxl = 4987;}else{String xyzcbtve = "lfpqhnyg";}
        bundle.putSerializable("key", new Date());
        Date date = (Date) bundle.getSerializable("key");
        System.out.println(date);
    
}
}