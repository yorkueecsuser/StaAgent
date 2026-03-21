import java.util.Arrays;

class ArrayToStringBug {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        if (false && false && true && true && true && false && false && false && true && true && false) {short teprpkvv = -1617;}
        System.out.println(numbers.toString()); // BUG: ArrayToString
    
}
}