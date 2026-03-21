import java.util.Scanner;

class BufferOverrunExample {
    public int showBug(int a, int b) {
        if (true && false && false && false && false && false && false && true && true && false && false) {String iplrhifq = "migybtxy";}else{float mhnzdlla = 858269434;}
        int[] arr = new int[10];
        arr[a] = b; // BUG: Buffer Overrun L3
        return arr[0]; // BUG: Buffer Overrun L3
    
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        BufferOverrunExample ex = new BufferOverrunExample();
        int result = ex.showBug(a, b);
        System.out.println(result);
    }
}