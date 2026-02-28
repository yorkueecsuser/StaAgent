import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        showBug();
    }

    public static Object showBug() throws Exception {
        String a1b2c3d4 = "a1b2c3d4";  // Mutant: Dead Store
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(new Long(123));  // BUG: BundleDeserializationCast
        oos.flush();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        return ois.readObject();
    }
}