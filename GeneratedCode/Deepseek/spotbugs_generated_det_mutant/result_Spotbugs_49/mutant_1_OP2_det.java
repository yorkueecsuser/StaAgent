import java.util.Arrays;

class BugExample {
public int [] showBug(int [] array , int offset){
    int [] result = new int [ offset ];
    result = new int [ offset ];
    for(int i = 0; i <= offset; i ++){ result [ i ] = array [ i ]; }
    return result;
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        int[] array = {1, 2, 3, 4, 5};
        int offset = 6;
        int[] result = bugExample.showBug(array, offset);
        System.out.println(Arrays.toString(result));
    }
}