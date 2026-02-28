import java.io.FileWriter;
import java.io.IOException;

class CustomResources {
    public String showBug() {
        String result = "";
        String unusedVar = "unused";
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            result = "Success";
        } catch (IOException e) {
            e.printStackTrace();
            result = "Failure";
        }
        return result;
    }
}