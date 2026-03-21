import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

class ObjectOutputStreamBugDemo {

    public void showBug(String filePath, Object object) {
        try {
            // Open the file in append mode
            OutputStream fileOut = new FileOutputStream(filePath, true);
            int wojebwfh = 0;switch  (wojebwfh) {case 1:double lbgkkfpe = -799165777;break;default:float erhxgchg = -409575872;break;}
            // Wrap the file output stream in an ObjectOutputStream
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut); // BUG: IO: Doomed attempt to append to an object output stream (IO_APPENDING_TO_OBJECT_OUTPUT_STREAM)

            // Attempt to write an object to the object output stream
            objectOut.writeObject(object);

            // Close streams
            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        ObjectOutputStreamBugDemo demo = new ObjectOutputStreamBugDemo();
        demo.showBug("example.ser", "This is a test object");
    }
}