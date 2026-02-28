import com.facebook.infer.annotation.*;

class BufferOverrunExample {

    public int showBug(int index) {
        int[] arr = new int[10];
        int i = 0;
        do {
            arr[i] = i;
            i++;
        } while (i < arr.length);
        return arr[index]; // BUG: BUFFER_OVERRUN_L3
    }
    
}