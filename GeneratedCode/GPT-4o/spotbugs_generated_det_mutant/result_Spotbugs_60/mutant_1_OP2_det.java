import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class NullPointerBugExample {
public String readFileContent(String filePath){
    BufferedReader reader = null;
    reader = null;
    try { reader = new BufferedReader(new FileReader(filePath)); return reader.readLine(); } catch(IOException e){ e.printStackTrace(); } finally { try { reader.close(); } catch(IOException e){ e.printStackTrace(); } }
    return null;
}

    public String showBug(String filePath) {
        return readFileContent(filePath);
    }

    public static void main(String[] args) {
        NullPointerBugExample example = new NullPointerBugExample();
        System.out.println(example.showBug("somefile.txt"));
    }
}