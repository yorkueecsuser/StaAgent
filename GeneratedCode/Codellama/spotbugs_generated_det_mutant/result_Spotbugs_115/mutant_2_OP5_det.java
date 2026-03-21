import java.util.*;

class ICAST_INT_2_LONG_AS_INSTANT {
    public static void main(String[] args) {
        int seconds = 100;
        Date date = getDate(seconds);
        System.out.println(date);
    }

    public static Date getDate(int seconds) {
int cghiqwxn = 0;switch  (cghiqwxn) {case 1:boolean hnyrxfnx = false;break;default:float ctudjdcm = 688715451;break;}

        return new Date(seconds * 1000L); // BUG: ICAST: int value converted to long and used as absolute time (ICAST_INT_2_LONG_AS_INSTANT)
    
}
}