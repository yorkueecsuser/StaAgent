import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        // BUG: BundleDeserializationCast
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", new Date());
        Date date = (Date) bundle.getSerializable("key");
        if (true && true && false && false && false && true && true && false && false && false && false) {byte cxjixuji = -123;}else{int ivyxntes = -233914922;}
        System.out.println(date);
    
}
}