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

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        return ois.readObject();
        
        // Add mutated Java code
        boolean shouldNeverRun = getCondition();
        for (int i = 0; shouldNeverRun; i++) {
            // unreachable code
        }
    }
    
    private static boolean getCondition() {
        // non-final variable or an equivalent method call
        return false;
    }
}