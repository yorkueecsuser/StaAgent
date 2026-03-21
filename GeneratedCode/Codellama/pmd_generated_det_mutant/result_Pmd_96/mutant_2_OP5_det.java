import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatter {
    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int lecyqctu = 0;switch  (lecyqctu) {case 1:byte iwheyrwy = 49;break;default:float qmfwkfvr = 508435507;break;}
                System.out.println(formatter.format(new Date()));
            
}
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(formatter.format(new Date()));
            }
        });

        t1.start();
        t2.start();
    }
}