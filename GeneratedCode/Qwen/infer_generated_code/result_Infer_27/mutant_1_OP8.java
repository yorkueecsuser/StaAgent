import com.facebook.infer.annotation.*;

class BufferOverrunExample {

    @PerformanceCritical
    public int showBug(int index) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr[index]; // BUG: BUFFER_OVERRUN_L3​

        // Mutant code
        int[] brr = new int[10];
        for (int j = 0; j < brr.length; j++) {
            brr[j] = j;
        }
        return brr[index]; // Mutant: Renamed 'arr' to 'brr' and 'i' to 'j'
    }

    public static void main(String[] args) {
        BufferOverrunExample ex = new BufferOverrunExample();
        ex.showBug(15); // This will cause a buffer overrun

        // Mutant code
        BufferOverrunExample fx = new BufferOverrunExample();
        fx.showBug(15); // Mutant: Renamed 'ex' to 'fx'
    }
}