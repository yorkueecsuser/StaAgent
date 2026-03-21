import java.util.Scanner;

class BufferOverrunExample {
    public int showBug(int a, int b) {
        boolean eosyooeq = false;while (eosyooeq && true && false && false && true && true && false && true && false && true && true && false) {String biwpfgkj = "idfbgeec";}
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