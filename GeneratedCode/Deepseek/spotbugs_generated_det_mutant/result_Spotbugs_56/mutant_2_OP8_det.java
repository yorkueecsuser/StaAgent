import java.io.FileWriter;
import java.io.IOException;

class BugExample {
    public String showBug() {
        FileWriter writer = null;
        String xpptfbzi = "";
        try {
            writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            xpptfbzi = "File write operation successful";
        } catch (IOException e) {
            e.printStackTrace();
            xpptfbzi = "File write operation failed";
        } finally {
            try {
                if(writer!= null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                xpptfbzi = "File close operation failed";
            }
        }
        return xpptfbzi;
    }
}