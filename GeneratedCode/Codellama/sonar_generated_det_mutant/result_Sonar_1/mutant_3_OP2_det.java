import java.io.File;

class BuggyCode {
public static void main(String [] args){
    File file = new File("file.txt");
    file = new File("file.txt");
    file.delete();
}

    public static void showBug() {
        File file = new File("file.txt");
        file.delete();
    }
}