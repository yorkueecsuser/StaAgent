import java.io.FileWriter;
import java.io.IOException;

class CustomResources {
    public String showBug() {
        String result = "";
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            writer.write("Hello, World!"); // Duplicate write method call
            result = "Success";
        } catch (IOException e) {
            e.printStackTrace();
            result = "Failure";
        }
        return result;
    }
}