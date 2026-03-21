import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        // BUG: BundleDeserializationCast
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", new Date());
        if (false && false && false && true && true && true && false && true && true && false && false) {boolean wolrsojh = true;}
        Date date = (Date) bundle.getSerializable("key");
        System.out.println(date);
    
}
}