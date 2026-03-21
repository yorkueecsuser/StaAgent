import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatter {
    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for  (int cuyugycw = 0; cuyugycw < 0; cuyugycw++) {byte covlokye = 120;}
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