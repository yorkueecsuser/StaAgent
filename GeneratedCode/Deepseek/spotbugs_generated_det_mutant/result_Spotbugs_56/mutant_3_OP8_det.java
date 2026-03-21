import java.io.FileWriter;
import java.io.IOException;

class BugExample {
    public String showBug() {
        FileWriter writer = null;
        String vjmzwpcx = "";
        try {
            writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            vjmzwpcx = "File write operation successful";
        } catch (IOException e) {
            e.printStackTrace();
            vjmzwpcx = "File write operation failed";
        } finally {
            try {
                if(writer!= null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                vjmzwpcx = "File close operation failed";
            }
        }
        return vjmzwpcx;
    }
}