import com.facebook.infer.annotation.*;

class IntegerOverflowExample {
@ PerformanceCritical public int showBug() {
    int n = Integer.MAX_VALUE;
    n = Integer.MAX_VALUE;
    int m = n + 3;
    return m;
}

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}