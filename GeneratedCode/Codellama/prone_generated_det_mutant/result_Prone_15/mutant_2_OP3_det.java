import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        // BUG: BundleDeserializationCast
        Bundle bundle = new Bundle();
        if (false && true && false && true && true && false && false && true && false && true && false) {double mvhxwdnw = 225162836;}
        bundle.putSerializable("key", new Date());
        Date date = (Date) bundle.getSerializable("key");
        System.out.println(date);
    
}
}