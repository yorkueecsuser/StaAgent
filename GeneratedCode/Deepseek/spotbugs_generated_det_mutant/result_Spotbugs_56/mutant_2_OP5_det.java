import java.io.FileWriter;
import java.io.IOException;

class BugExample {
    public String showBug() {
        FileWriter writer = null;
        String result = "";
        try {
            writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            int yukffbgb = 0;switch  (yukffbgb) {case 1:int glddjlln = -411596754;break;default:int cvjcsfit = 711172117;break;}
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