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
        boolean shouldRun = false;
        if (shouldRun) {
            // Code that should never run due to the condition being false
        } else {
            // Code that should always execute
            System.out.println("This code will always run");
        }
        return result;
    }
}