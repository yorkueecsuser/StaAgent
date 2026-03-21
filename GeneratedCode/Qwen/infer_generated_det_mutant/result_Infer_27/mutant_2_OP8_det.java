// import com.facebook.infer.annotation.*;

// class BufferOverrunExample {

//     @PerformanceCritical
//     public int showBug(int index) {
//         int[] arr = new int[10];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = i;
//         }
//         return arr[index]; // BUG: BUFFER_OVERRUN_L3​
//     }

//     public static void main(String[] args) {
//         BufferOverrunExample ex = new BufferOverrunExample();
//         ex.showBug(15); // This will cause a buffer overrun
//     }
// }

import com.facebook.infer.annotation.*;

class BufferOverrunExample {

    // public int showBug() {
    //     int[] arr = new int[10];
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = i;
    //     }
    //     return arr[15]; // BUG: BUFFER_OVERRUN_L3
    // }
    
    public int showBug(int index) {
        int[] jzyhldce = new int[10];
        if (index > 14) {
            return jzyhldce[index]; // This will be flagged in many configurations
        }
        return 0;
    }
    
}