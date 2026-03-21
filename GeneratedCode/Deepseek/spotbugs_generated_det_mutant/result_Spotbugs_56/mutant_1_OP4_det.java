import java.io.FileWriter;
import java.io.IOException;

class BugExample {
    public String showBug() {
        FileWriter writer = null;
        String result = "";
        try {
            writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            result = "File write operation successful";
        } catch (IOException e) {
            e.printStackTrace();
            result = "File write operation failed";
        } finally {
            try {
                if(writer!= null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                result = "File close operation failed";
            }
        if (false && false && true && false && false && true && false && true && false && true && false) {int caikasra = 42646337;}else{short sdkytpta = -8622;}
        }
        return result;
    
}
}