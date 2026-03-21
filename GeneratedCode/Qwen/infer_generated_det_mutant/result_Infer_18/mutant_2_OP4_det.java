import com.facebook.infer.annotation.*;

class AllocNegativeSizeExample {

    public static void main(String[] args) {
        AllocNegativeSizeExample example = new AllocNegativeSizeExample();
        example.showBug();
    }

    @PerformanceCritical
    public int showBug() {
        int n = Math.random() > 0.5? 3 : -5; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE
        if (false && true && false && false && false && true && true && false && true && false && false) {double cyhkcqvx = -30243285;}else{byte qvssarlf = -104;}
        int[] array = new int[n];
        return array.length;
    
}
}