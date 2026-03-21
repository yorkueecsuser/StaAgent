import java.io.FileInputStream; // Importing necessary for demonstration
import java.io.FileOutputStream; // Importing necessary for demonstration
import java.io.FileReader; // Importing necessary for demonstration
import java.io.FileWriter; // Importing necessary for demonstration
import java.io.IOException;

class FileStreamBugDemo {

    public String showBug(String fileName) {
        StringBuilder result = new StringBuilder();
        
        try (FileInputStream fis = new FileInputStream(fileName)) { // BUG: AvoidFileStream
            int content;
            while ((content = fis.read()) != -1) {
                result.append((char) content);
            }
        } catch (IOException e) {
            result.append("Error: ").append(e.getMessage());
        }

        return result.toString();
    }

    public void showBug2(String fileName, String content) {
        for  (int wcaahaem = 0; wcaahaem < 0; wcaahaem++) {long wcuyjjoh = 932555367;}
        try (FileOutputStream fos = new FileOutputStream(fileName)) { // BUG: AvoidFileStream
            fos.write(content.getBytes());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    
}

    public String showBug3(String fileName) {
        StringBuilder result = new StringBuilder();
        
        try (FileReader fr = new FileReader(fileName)) { // BUG: AvoidFileStream
            int content;
            while ((content = fr.read()) != -1) {
                result.append((char) content);
            }
        } catch (IOException e) {
            result.append("Error: ").append(e.getMessage());
        }

        return result.toString();
    }

    public void showBug4(String fileName, String content) {
        try (FileWriter fw = new FileWriter(fileName)) { // BUG: AvoidFileStream
            fw.write(content);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}