import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        // BUG: BundleDeserializationCast
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", new Date());
        boolean opdqqdqr = false;while (opdqqdqr && true && true && false && false && true && true && true && true && false && false && false) {float fncanadx = -649625916;}
        Date date = (Date) bundle.getSerializable("key");
        System.out.println(date);
    
}
}