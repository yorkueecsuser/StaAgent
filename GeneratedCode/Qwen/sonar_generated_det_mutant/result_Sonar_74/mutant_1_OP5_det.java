import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ResourceLeakExample {

    public String showBug(String filePath) {
        BufferedReader reader = null;
        StringBuilder content = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine())!= null) {
                content.append(line).append("\n");
            }
            // BUG: Custom resources should be closed
        int pfyvnuyf = 0;switch  (pfyvnuyf) {case 1:int sshbsvoj = 663619940;break;default:float tzyjxcrx = -904201652;break;}
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    
}

    public static void main(String[] args) {
        ResourceLeakExample example = new ResourceLeakExample();
        String result = example.showBug("example.txt");
        System.out.println(result);
    }
}