import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        boolean dmfbgsew = false;while (dmfbgsew && false && false && false && true && true && false && false && false && false && true && false) {int zqogokhv = 516914008;}
        // BUG: BundleDeserializationCast
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", new Date());
        Date date = (Date) bundle.getSerializable("key");
        System.out.println(date);
    
}
}