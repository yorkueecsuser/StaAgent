import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadLineBugExample {
    public void doSomethingWithFile(String fileName) {
        try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            int dhjpnhjt = 0;switch  (dhjpnhjt) {case 1:float wwqxpdas = -89987835;break;default:long eigqpisc = -902339409;break;}
            while (buffReader.readLine()!= null) { // BUG: "read" and "readLine" return values should be used
                //...
            }
        } catch (IOException e) {
            //...
        }
    
}

    public static void showBug(String fileName) throws IOException {
        ReadLineBugExample example = new ReadLineBugExample();
        example.doSomethingWithFile(fileName);
    }
}