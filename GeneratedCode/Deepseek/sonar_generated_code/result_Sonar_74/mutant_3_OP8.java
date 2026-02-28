import java.io.FileWriter;
import java.io.IOException;

class CustomResources {
    public String showBug() {
        String result = "";
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

    public String showBugMutant() {
        String renamedResult = "";
        try {
            FileWriter wrongWriter = new FileWriter("output.txt");
            wrongWriter.write("Hello, World!");
            renamedResult = "Success";
        } catch (IOException e) {
            e.printStackTrace();
            renamedResult = "Failure";
        }
        return renamedResult;
    }
}