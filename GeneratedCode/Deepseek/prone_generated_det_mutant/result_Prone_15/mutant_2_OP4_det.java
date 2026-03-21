import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        showBug();
    }

    public static Object showBug() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        if (true && false && true && true && true && true && true && true && false && false && false) {char pzfnesla = 'y';}else{float hgxcujaz = -700478109;}
        oos.writeObject(new Long(123));  // BUG: BundleDeserializationCast
        oos.flush();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        return ois.readObject();
    
}
}