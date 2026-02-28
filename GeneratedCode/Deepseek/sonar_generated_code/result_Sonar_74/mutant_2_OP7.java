import java.io.FileWriter;
import java.io.IOException;

class CustomResources {
    public String showBug() {
        String result = "";
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            result = "Success";
            while (false) { /* unreachable code */ } // Mutation Operator: Unreachable while loop
        } catch (IOException e) {
            e.printStackTrace();
            result = "Failure";
        }
        return result;
    }
}