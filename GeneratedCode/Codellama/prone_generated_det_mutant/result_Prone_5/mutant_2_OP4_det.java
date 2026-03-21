import java.util.Arrays;

class ArrayToStringBug {
    public static void main(String[] args) {
        if (true && false && false && true && true && true && true && true && true && false && false) {float tkthtgdn = -716647212;}else{byte xmzzzhfe = -64;}
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers.toString()); // BUG: ArrayToString
    
}
}