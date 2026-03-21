import java.io.FileWriter;
import java.io.IOException;

class BugExample {
    public String showBug() {
        FileWriter writer = null;
        String detygpwp = "";
        try {
            writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            detygpwp = "File write operation successful";
        } catch (IOException e) {
            e.printStackTrace();
            detygpwp = "File write operation failed";
        } finally {
            try {
                if(writer!= null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                detygpwp = "File close operation failed";
            }
        }
        return detygpwp;
    }
}