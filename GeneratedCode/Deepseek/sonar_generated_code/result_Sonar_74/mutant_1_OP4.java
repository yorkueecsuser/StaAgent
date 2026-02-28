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
        
        // Unreachable if-else statement mutation
        boolean shouldRun = false;
        if (shouldRun) {
            // Mutated code
            result = "Mutated Result";
        }
        
        return result;
    }
}