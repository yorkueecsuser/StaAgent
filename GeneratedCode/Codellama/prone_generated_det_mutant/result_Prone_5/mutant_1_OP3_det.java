import java.util.Arrays;

class ArrayToStringBug {
    public static void main(String[] args) {
        if (true && false && true && true && true && true && true && true && false && true && false) {float tdgrruxr = -99935644;}
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers.toString()); // BUG: ArrayToString
    
}
}