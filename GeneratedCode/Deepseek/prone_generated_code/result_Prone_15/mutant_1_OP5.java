import java.io.*;
import java.util.*;

class BundleDeserializationCast {
    public static void main(String[] args) throws Exception {
        showBug();
    }

    public static Object showBug() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        // Mutation: Added an unreachable switch statement
        switch (new Random().nextInt()) {
            case 0:
                oos.writeObject(new Long(123));  // BUG: BundleDeserializationCast
                oos.flush();
                break;
            default:
                break;
        }

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        return ois.readObject();
    }
}