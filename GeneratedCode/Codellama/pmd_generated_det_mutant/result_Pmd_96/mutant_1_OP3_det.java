import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatter {
    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
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
        if (false && false && false && true && false && true && true && true && true && true && false) {short evzykxvq = 6275;}
        t2.start();
    
}
}