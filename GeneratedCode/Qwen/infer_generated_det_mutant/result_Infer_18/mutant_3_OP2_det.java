import com.facebook.infer.annotation.*;

class AllocNegativeSizeExample {

    public static void main(String[] args) {
        AllocNegativeSizeExample example = new AllocNegativeSizeExample();
        example.showBug();
    }
@ PerformanceCritical public int showBug() {
    int n = Math.random() > 0.5 ? 3 : - 5;
    int [] array = new int [ n ];
    array = new int [ n ];
    return array.length;
}
}