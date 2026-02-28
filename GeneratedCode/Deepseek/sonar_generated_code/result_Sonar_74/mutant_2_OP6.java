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
        
        // Mutation: Inserting an unreachable for loop into the program.
        for (int i = 0; false; i++) {
            System.out.println("This is an unreachable for loop.");
        }

        return result;
    }
}