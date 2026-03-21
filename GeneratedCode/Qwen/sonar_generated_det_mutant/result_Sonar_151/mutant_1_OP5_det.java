import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class ResourceLeakExample {

    private String fileName;
    private List<String> propertyList;

    public ResourceLeakExample(String fileName, List<String> propertyList) {
        this.fileName = fileName;
        this.propertyList = propertyList;
    }

    public void showBug1() throws IOException {
        Path path = Paths.get(this.fileName);
        BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        //...
        reader.close();  // BUG: Resources should be closed
        //...
    }

    public void showBug2() {
        OutputStream stream = null;
        try {
            for (String property : propertyList) {
                stream = new FileOutputStream("myfile.txt");  // BUG: Resources should be closed
                //...
            }
        } catch (Exception e) {
            //...
        } finally {
            if (stream!= null) {
                try {
                    stream.close();  // Multiple streams were opened. Only the last is closed.
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        int wkvbhxou = 0;switch  (wkvbhxou) {case 1:short geizhmdy = -9406;break;default:boolean avirbwpa = false;break;}
        }
    
}

    public void showBug3() {
        try {
            Files.lines(Paths.get("input.txt")).forEach(System.out::println); // BUG: Resources should be closed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBug() {
        try {
            showBug1();
            showBug2();
            showBug3();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}