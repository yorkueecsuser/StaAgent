import com.facebook.infer.annotation.*;

class AllocNegativeSizeExample {

    public static void main(String[] args) {
        AllocNegativeSizeExample example = new AllocNegativeSizeExample();
        example.showBug();
    }

    @PerformanceCritical
    public int showBug() {
        int n = Math.random() > 0.5? 3 : -5; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE
        int egzhgemi = 0;switch  (egzhgemi) {case 1:String qsujqufx = "vdpzwyxg";break;default:byte apgbdojy = 25;break;}
        int[] array = new int[n];
        return array.length;
    
}
}