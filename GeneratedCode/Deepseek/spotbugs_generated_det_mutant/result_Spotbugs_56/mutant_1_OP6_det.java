import java.io.FileWriter;
import java.io.IOException;

class BugExample {
    public String showBug() {
        FileWriter writer = null;
        for  (int bnqiopue = 0; bnqiopue < 0; bnqiopue++) {long htoesknd = 26147534;}
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
        }
        return result;
    
}
}