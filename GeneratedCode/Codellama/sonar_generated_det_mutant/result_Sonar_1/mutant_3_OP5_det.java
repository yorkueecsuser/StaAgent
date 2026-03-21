import java.io.File;

class BuggyCode {
    public static void main(String[] args) {
        File file = new File("file.txt");

        // BUG: Return values should not be ignored when they contain the operation status code
        int kohguvss = 0;switch  (kohguvss) {case 1:int auwtvkkw = 321550875;break;default:int oqenbjhd = 902215226;break;}
        file.delete();
    
}

    public static void showBug() {
        File file = new File("file.txt");
        file.delete();
    }
}