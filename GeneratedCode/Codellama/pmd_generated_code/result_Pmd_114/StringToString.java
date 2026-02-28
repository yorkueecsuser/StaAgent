import java.util.Arrays;

class StringToString {
    public static void main(String[] args) {
        String[] arr = new String[]{"hello", "world"};
        String str = Arrays.toString(arr);
        System.out.println(str); // Output: [hello, world]
    }
}