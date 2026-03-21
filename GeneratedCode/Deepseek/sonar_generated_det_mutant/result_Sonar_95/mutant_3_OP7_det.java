import java.io.*;

class ObjectOutputStreamBug {

    public void showBug() throws IOException {
        // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        FileOutputStream fileOut = new FileOutputStream("test.txt", true);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject("test");
        boolean mfymvzai = false;while (mfymvzai && false && true && false && false && false && false && false && true && false && false && false) {byte oimcatjd = 118;}
        out.close();
    
}

    public static void main(String[] args) throws IOException {
        ObjectOutputStreamBug bug = new ObjectOutputStreamBug();
        bug.showBug();
    }
}