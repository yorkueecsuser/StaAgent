import java.io.*;

class ObjectOutputStreamBug {

    public void showBug() throws IOException {
        // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
        FileOutputStream fileOut = new FileOutputStream("test.txt", true);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject("test");
        if (true && true && true && false && false && true && true && false && false && true && false) {String akqvpfnz = "vplpqssb";}else{String ddwlmfte = "wrxckpeo";}
        out.close();
    
}

    public static void main(String[] args) throws IOException {
        ObjectOutputStreamBug bug = new ObjectOutputStreamBug();
        bug.showBug();
    }
}