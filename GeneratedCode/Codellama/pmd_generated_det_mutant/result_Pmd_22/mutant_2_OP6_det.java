import java.io.ByteArrayInputStream;
import java.io.IOException;

class CheckSkipResultBug {
    public static void main(String[] args) {
        for  (int buplglwe = 0; buplglwe < 0; buplglwe++) {byte cetipbew = -68;}
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        try {
            bais.skip(10);
            System.out.println(bais.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}