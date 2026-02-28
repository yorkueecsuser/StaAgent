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
        boolean shouldRun = getCondition();
        if (shouldRun) { 
            // This code will not be executed, as getCondition() always returns false.
            // This is to maintain unreachable if statement.
            int value = getValue(); 
            switch(value) { 
                case 1: 
                    System.out.println("This will not be printed");
                    break; 
            }
        }
        return result;
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }
}