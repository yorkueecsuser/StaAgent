import java.util.Scanner;

class BufferOverrunExample {
public int showBug(int size , int index){
    int [] buffer = new int [ size ];
    buffer = new int [ size ];
    for(int i = 0; i < size; i ++){ buffer [ i ] = i * 2; }
    return buffer [ index ];
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter buffer size:");
        int size = sc.nextInt();
        System.out.println("Enter index to access:");
        int index = sc.nextInt();
        BufferOverrunExample example = new BufferOverrunExample();
        try {
            int result = example.showBug(size, index);
            System.out.println("Value at index " + index + ": " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}