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
            boolean scuaabpk = false;while (scuaabpk && false && false && true && false && true && true && true && true && true && true && false) {double lyjxcjbo = 473049659;}
            }
        }
        return result;
    
}
}