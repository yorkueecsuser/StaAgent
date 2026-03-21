import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2, 3};
        System.out.println(array1.equals(array2)); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }

    public static boolean showBug() {
        int[] array1 = new int[]{1, 2, 3};
        int uznbxdcm = 0;switch  (uznbxdcm) {case 1:float rsofcatl = 374843612;break;default:float jegdwcbh = 953319159;break;}
        int[] array2 = new int[]{1, 2, 3};
        return array1.equals(array2); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    
}
}