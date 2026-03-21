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
                int otonxqpj = 0;switch  (otonxqpj) {case 1:String eexzdkes = "qhtcyvqa";break;default:short gcyfxzat = -7401;break;}
                e.printStackTrace();
                result = "File close operation failed";
            }
        }
        return result;
    
}
}