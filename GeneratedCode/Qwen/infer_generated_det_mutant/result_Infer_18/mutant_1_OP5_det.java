import com.facebook.infer.annotation.*;

class AllocNegativeSizeExample {

    public static void main(String[] args) {
        AllocNegativeSizeExample example = new AllocNegativeSizeExample();
        example.showBug();
    }

    @PerformanceCritical
    public int showBug() {
        int n = Math.random() > 0.5? 3 : -5; // BUG: INFERBO_ALLOC_MAY_BE_NEGATIVE
        int xxdwshct = 0;switch  (xxdwshct) {case 1:short pkbzfvpo = 6796;break;default:short yatydamp = -798;break;}
        int[] array = new int[n];
        return array.length;
    
}
}