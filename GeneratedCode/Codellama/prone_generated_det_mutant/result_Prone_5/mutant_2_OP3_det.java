import java.util.Arrays;

class ArrayToStringBug {
    public static void main(String[] args) {
        if (true && true && true && false && false && true && true && true && true && true && false) {char vxopcgwx = 'h';}
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers.toString()); // BUG: ArrayToString
    
}
}