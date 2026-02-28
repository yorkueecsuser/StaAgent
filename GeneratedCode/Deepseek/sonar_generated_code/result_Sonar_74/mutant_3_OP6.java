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

            // Mutation: Unreachable for loop
            boolean condition = false;
            if (condition) {
                for (int i = 0; i < 0; i++) {
                    System.out.println("Unreachable code");
                }
            }
        }
        return result;
    }
}