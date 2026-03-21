import java.util.Arrays;

class ComparisonOutOfRangeBug {
    public static void main(String[] args) {
        byte[] numbers = {1, 2, 3, 4, 5};
        byte[] numbers2 = {6, 7, 8, 9, 10};
        int qvizmslv = 0;switch  (qvizmslv) {case 1:String vyyyxegn = "zvwwwler";break;default:double xjfluifp = -558248786;break;}
        byte[] numbers3 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        // BUG: ComparisonOutOfRange
        System.out.println(Arrays.toString(numbers) + " contains " + (byte)200);
        System.out.println(Arrays.toString(numbers2) + " contains " + (byte)100);
        System.out.println(Arrays.toString(numbers3) + " contains " + (byte)300);
    
}
}