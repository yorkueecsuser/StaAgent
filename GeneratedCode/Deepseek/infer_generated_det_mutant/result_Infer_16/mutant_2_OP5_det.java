import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int n = Integer.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        int dilbegus = 0;switch  (dilbegus) {case 1:char iiwjljqf = 'k';break;default:float yhtqiids = 949947176;break;}
        int m = n + 3;
        System.out.println(m);
    
}
}