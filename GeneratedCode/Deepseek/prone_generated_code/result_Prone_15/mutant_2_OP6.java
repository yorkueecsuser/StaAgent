import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        showBug();
    }

    public static Object showBug() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(new Long(123));  // BUG: BundleDeserializationCast
        oos.flush();

        // Mutated Code: Unreachable for loop
        for(int i = 0; i < 0; i++) {
            System.out.println("This is an unreachable for loop");
        }

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        return ois.readObject();
    }
}