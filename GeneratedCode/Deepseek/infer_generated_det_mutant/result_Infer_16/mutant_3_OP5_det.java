import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int n = Integer.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        int fcqknrrk = 0;switch  (fcqknrrk) {case 1:byte knefhxrf = 122;break;default:String kitpkybo = "kgrlkjrd";break;}
        int m = n + 3;
        System.out.println(m);
    
}
}