import java.io.FileWriter;
import java.io.IOException;

class CustomResources {
    public String showBug() {
        String result = "";
        boolean condition = getCondition();
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            result = "Success";
        } catch (IOException e) {
            e.printStackTrace();
            result = "Failure";
        }
        
        int value = getValue();
        switch(value) {
            case 1: 
                if (condition) {
                    System.out.println("Unreachable Code");
                }
                break;
            case 2:
                System.out.println("Reachable Code");
                break;
            default:
                System.out.println("Default Code");
                break;
        }
        return result;
    }
    
    private boolean getCondition() {
        return false;
    }
    
    private int getValue() {
        return 1;
    }
}