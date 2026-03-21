import java.io.*;

class ObjectOutputStreamBug {

    public void showBug() throws IOException {
        // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        FileOutputStream fileOut = new FileOutputStream("test.txt", true);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject("test");
        int dhtyzbfr = 0;switch  (dhtyzbfr) {case 1:byte kiyibfnt = 46;break;default:long oyuylvgn = -836537673;break;}
        out.close();
    
}

    public static void main(String[] args) throws IOException {
        ObjectOutputStreamBug bug = new ObjectOutputStreamBug();
        bug.showBug();
    }
}