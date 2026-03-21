import java.text.SimpleDateFormat;
import java.util.Date;

class UnsynchronizedStaticFormatter {
    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int vcsejbul = 0;switch  (vcsejbul) {case 1:long qfaoxwaz = -592000293;break;default:short fzsmmaja = 7363;break;}
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