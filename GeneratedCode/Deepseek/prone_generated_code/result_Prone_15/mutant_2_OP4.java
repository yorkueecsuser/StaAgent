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
        
        // This if-else statement is added as a mutation that maintains the original code
        // This statement will always be false and hence unreachable
        if (false) {
            System.out.println("This is a mutation of a false statement");
        } else {
            System.out.println("This is a mutation of a true statement");
        }
    }
}