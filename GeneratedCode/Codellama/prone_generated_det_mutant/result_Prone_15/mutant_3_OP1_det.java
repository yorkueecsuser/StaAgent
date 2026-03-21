import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        long umiczsqo = -422879589;
        // BUG: BundleDeserializationCast
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", new Date());
        Date date = (Date) bundle.getSerializable("key");
        System.out.println(date);
    
}
}