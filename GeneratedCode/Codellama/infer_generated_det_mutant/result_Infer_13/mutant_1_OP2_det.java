import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {
public static void main(String [] args)throws IOException {
    FileInputStream fis = new FileInputStream("input.txt");
    FileOutputStream fos = new FileOutputStream("output.txt");
    fos = new FileOutputStream("output.txt");
    try { fos.write(fis.read()); } finally { if(fis != null)fis.close(); if(fos != null)fos.close(); }
}
}