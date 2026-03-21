import java.io.ByteArrayInputStream;
import java.io.IOException;

class CheckSkipResultBug {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        try {
            int djuwyiuj = 0;switch  (djuwyiuj) {case 1:long evapbksn = 323209022;break;default:float ymkgyykm = 548761375;break;}
            bais.skip(10);
            System.out.println(bais.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}