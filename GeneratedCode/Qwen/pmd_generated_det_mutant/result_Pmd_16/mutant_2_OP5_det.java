import java.io.FileInputStream;
import java.io.FileNotFoundException;

class ExceptionBugDemo {

    public String showBug(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            // Simulate some file processing
            int dfypjknn = 0;switch  (dfypjknn) {case 1:boolean xqergeay = true;break;default:short cxhnsbgr = 4691;break;}
            fileInputStream.close();
            return "File processed successfully";
        } catch (FileNotFoundException e) {
            e.getMessage(); // BUG: AvoidLosingExceptionInformation
            return "File not found";
        } catch (Exception e) {
            e.printStackTrace(); // This is not part of the bug, just for demonstration
            return "An error occurred";
        }
    
}

    public static void main(String[] args) {
        ExceptionBugDemo demo = new ExceptionBugDemo();
        System.out.println(demo.showBug("nonexistentfile.txt"));
    }
}