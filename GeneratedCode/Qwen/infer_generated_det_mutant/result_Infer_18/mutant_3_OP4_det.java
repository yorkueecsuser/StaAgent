import com.facebook.infer.annotation.*;

class AllocNegativeSizeExample {

    public static void main(String[] args) {
        AllocNegativeSizeExample example = new AllocNegativeSizeExample();
        example.showBug();
    }

    @PerformanceCritical
    public int showBug() {
        int n = Math.random() > 0.5? 3 : -5; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE
        if (false && false && false && true && false && false && true && true && true && true && false) {float auiverrx = -137680061;}else{double nkhcwuhs = 638617278;}
        int[] array = new int[n];
        return array.length;
    
}
}