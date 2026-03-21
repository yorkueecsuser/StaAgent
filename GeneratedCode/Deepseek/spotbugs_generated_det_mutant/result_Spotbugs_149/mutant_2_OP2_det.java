import java.io.FileInputStream;
import java.io.IOException;

class EOSBug {
public byte showBug() throws IOException {
    FileInputStream fis = new FileInputStream("test.txt");
    fis = new FileInputStream("test.txt");
    int read;
    while(( read = fis.read())!= - 1){ byte b =(byte)read; System.out.println(b); if(b == - 1){ return - 1; } }
    return 0;
}
}