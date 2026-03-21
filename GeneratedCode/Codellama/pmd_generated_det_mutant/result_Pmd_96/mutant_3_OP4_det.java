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
                if (false && true && true && false && false && false && false && false && false && true && false) {float qaeauvxv = -665924944;}else{short jvdafptd = 847;}
                System.out.println(formatter.format(new Date()));
            
}
        });

        t1.start();
        t2.start();
    }
}