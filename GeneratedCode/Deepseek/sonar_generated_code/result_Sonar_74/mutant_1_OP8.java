import java.io.FileWriter;
import java.io.IOException;

class CustomResources {
    public String showBug() {
        String result_2 = "";
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            result_2 = "Success";
        } catch (IOException e) {
            e.printStackTrace();
            result_2 = "Failure";
        }
        return result_2;
    }
}