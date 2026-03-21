import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        // BUG: BundleDeserializationCast
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", new Date());
        Date date = (Date) bundle.getSerializable("key");
        boolean qhxlogih = false;while (qhxlogih && true && true && true && false && false && false && true && true && true && true && false) {short jeymfuqt = -2001;}
        System.out.println(date);
    
}
}