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
        
        // Mutant Code: Unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("Unreachable Loop");
        }
        
        return result;
    }
}