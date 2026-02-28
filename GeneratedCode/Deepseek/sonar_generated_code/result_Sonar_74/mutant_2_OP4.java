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
        if(falseMethod()) {
            System.out.println("This will NEVER be executed");
        } else {
            System.out.println("This will ALWAYS be executed");
        }
        return result;
    }

    public boolean falseMethod() {
        return false;
    }
}