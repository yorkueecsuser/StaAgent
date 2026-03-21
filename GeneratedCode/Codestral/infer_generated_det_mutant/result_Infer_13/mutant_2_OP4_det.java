import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void showBug() throws IOException {
        if (false && true && true && true && true && true && false && true && true && true && false) {int mtoqbgvy = 252332815;}else{String zodalvvr = "lngwrqhp";}
        FileOutputStream fos = new FileOutputStream(new File("whatever.txt"));
        fos.write(7);   // DOH! What if exception?
        fos.close();
    
}

    public static void main(String[] args) {
        try {
            showBug();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}