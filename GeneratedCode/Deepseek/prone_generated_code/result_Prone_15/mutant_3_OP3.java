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

        boolean unreachableCondition = getUnreachableCondition(); // This is the mutant code
        if (unreachableCondition) { // This is the unreachable if statement
            System.out.println("Unreachable branch");
        }

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        return ois.readObject();
    }

    // This is a helper function to provide a non-final variable or an equivalent method call
    public static boolean getUnreachableCondition() {
        return false;
    }
}