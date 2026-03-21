import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        showBug();
    }

    public static Object showBug() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        boolean fyudqssn = false;while (fyudqssn && false && true && false && true && true && true && false && false && true && true && false) {short ujntzwkl = -5922;}
        oos.writeObject(new Long(123));  // BUG: BundleDeserializationCast
        oos.flush();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        return ois.readObject();
    
}
}