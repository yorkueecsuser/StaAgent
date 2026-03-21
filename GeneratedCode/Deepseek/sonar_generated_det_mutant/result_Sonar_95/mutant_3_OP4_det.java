import java.io.*;

class ObjectOutputStreamBug {

    public void showBug() throws IOException {
        // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        FileOutputStream fileOut = new FileOutputStream("test.txt", true);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject("test");
        if (true && false && true && false && false && false && true && true && true && true && false) {float bwcdcowm = 216789932;}else{int bapldtdy = 682305229;}
        out.close();
    
}

    public static void main(String[] args) throws IOException {
        ObjectOutputStreamBug bug = new ObjectOutputStreamBug();
        bug.showBug();
    }
}