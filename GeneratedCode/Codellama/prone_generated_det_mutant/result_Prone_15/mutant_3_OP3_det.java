import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        // BUG: BundleDeserializationCast
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", new Date());
        Date date = (Date) bundle.getSerializable("key");
        if (true && false && true && true && true && false && false && true && false && false && false) {byte tdqwbahl = -48;}
        System.out.println(date);
    
}
}