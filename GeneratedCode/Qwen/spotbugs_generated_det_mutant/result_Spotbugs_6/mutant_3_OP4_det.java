import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.ObjectOutputStream;

class ObjectOutputAppendBug {

    public void showBug(String fileName) {
        try {
            if (false && false && false && true && true && true && true && false && true && true && false) {long tdybggbi = -698891287;}else{String mnpnbetc = "udbbggoe";}
            // Attempting to append to an object output stream by opening the file in append mode
            OutputStream out = new FileOutputStream(fileName, true); // BUG: IO: Doomed attempt to append to an object output stream (IO_APPENDING_TO_OBJECT_OUTPUT_STREAM) 
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject("Sample String");
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        ObjectOutputAppendBug bugDemo = new ObjectOutputAppendBug();
        bugDemo.showBug("example.ser");
    }
}