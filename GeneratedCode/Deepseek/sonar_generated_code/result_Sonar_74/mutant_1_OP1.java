import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

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

        // Mutation: Inserting unused variable declaration with primitive type
        Random rand = new Random();
        String unusedVar = String.valueOf(rand.nextInt(10000000));
        return result;
    }
}