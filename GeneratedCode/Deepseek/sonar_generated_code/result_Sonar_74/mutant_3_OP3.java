import java.io.FileWriter;
import java.io.IOException;

class CustomResources {
    public String showBug() {
        String result = "";
        boolean shouldNotReachHere = false;
        if (shouldNotReachHere) {
            // This code will never be executed due to the "shouldNotReachHere"
            // condition being statically set to "false"
            System.out.println("This code should never be executed");
        } else {
            try {
                FileWriter writer = new FileWriter("output.txt");
                writer.write("Hello, World!");
                result = "Success";
            } catch (IOException e) {
                e.printStackTrace();
                result = "Failure";
            }
        }
        return result;
    }
}