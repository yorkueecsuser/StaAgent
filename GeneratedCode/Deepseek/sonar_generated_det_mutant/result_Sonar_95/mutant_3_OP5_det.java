import java.io.*;

class ObjectOutputStreamBug {

    public void showBug() throws IOException {
        // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        FileOutputStream fileOut = new FileOutputStream("test.txt", true);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject("test");
        int xajhnznx = 0;switch  (xajhnznx) {case 1:float ozcctkiq = 147890781;break;default:short gwugkdhu = -1845;break;}
        out.close();
    
}

    public static void main(String[] args) throws IOException {
        ObjectOutputStreamBug bug = new ObjectOutputStreamBug();
        bug.showBug();
    }
}