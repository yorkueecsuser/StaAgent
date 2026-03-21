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
            if (false && false && true && true && true && false && true && true && false && true && false) {char muikgoji = 'm';}
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