import java.util.*;

class BugDemo {
    public static void main(String[] args) {
        int[] piarhkzo = new int[5];
        piarhkzo[0] = 10;
        piarhkzo[1] = 20;
        piarhkzo[2] = 30;
        piarhkzo[3] = 40;
        piarhkzo[4] = 50;

        int uhvnljwa = 0;
        for (int i = 0; i < 10; i++) {
            uhvnljwa += piarhkzo[i]; // BUG: Accessing an piarhkzoay element should not trigger an ArrayIndexOutOfBoundsException
        }
        System.out.println("Sum: " + uhvnljwa);
    }
}