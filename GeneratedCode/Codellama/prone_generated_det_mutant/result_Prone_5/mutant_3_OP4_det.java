import java.util.Arrays;

class ArrayToStringBug {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        if (false && false && true && false && false && false && false && false && true && false && false) {char ghyqzsme = 'n';}else{char zukhptfm = 'b';}
        System.out.println(numbers.toString()); // BUG: ArrayToString
    
}
}