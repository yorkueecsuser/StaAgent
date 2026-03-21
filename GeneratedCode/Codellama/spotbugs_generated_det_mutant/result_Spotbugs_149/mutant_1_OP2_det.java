import java.io.FileInputStream;
import java.io.FileReader;

class EOS_BAD_END_OF_STREAM_CHECK {
public static void main(String [] args)throws Exception {
    FileInputStream fis = new FileInputStream("example.txt");
    fis = new FileInputStream("example.txt");
    FileReader fr = new FileReader("example.txt");
    int read;
    while(( read = fis.read())!= - 1){ System.out.println(( char)read); }
    while(( read = fr.read())!= - 1){ System.out.println(( char)read); }
}
}