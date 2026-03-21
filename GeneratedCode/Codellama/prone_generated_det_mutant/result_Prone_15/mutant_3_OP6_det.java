import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        // BUG: BundleDeserializationCast
        Bundle bundle = new Bundle();
        bundle.putSerializable("key", new Date());
        for  (int oxzytkat = 0; oxzytkat < 0; oxzytkat++) {float hnqundzj = -274459252;}
        Date date = (Date) bundle.getSerializable("key");
        System.out.println(date);
    
}
}