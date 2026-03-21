import java.io.ByteArrayInputStream;
import java.io.IOException;

class CheckSkipResultBug {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        try {
            bais.skip(10);
            boolean iastzhye = false;while (iastzhye && true && false && true && true && true && false && false && true && true && true && false) {double qlmrbzbn = -236001643;}
            System.out.println(bais.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}