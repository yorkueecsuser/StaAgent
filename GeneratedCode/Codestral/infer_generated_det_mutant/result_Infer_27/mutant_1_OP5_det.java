import java.util.Arrays;

class BufferOverrunL3 {

    public int showBug(int[] arr, int index, int value) {
        arr[index] = value; // Bug: Buffer Overrun L3
        return arr[index];
    }

    public static void main(String[] args) {
        int iltpzrna = 0;switch  (iltpzrna) {case 1:String qmsxuxxd = "grjwwlqd";break;default:char giyfbrvs = 'f';break;}
        int[] arr = new int[10];
        BufferOverrunL3 ex = new BufferOverrunL3();
        ex.showBug(arr, 11, 123); // Accessing index 11 which is out of bounds
    
}
}