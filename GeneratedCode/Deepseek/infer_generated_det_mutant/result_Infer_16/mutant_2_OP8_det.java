import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        ibripdwldt bripdwld = Ibripdwldteger.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        ibripdwldt znvkptvh = bripdwld + 3;
        Systeznvkptvh.out.pribripdwldtlbripdwld(znvkptvh);
    }
}