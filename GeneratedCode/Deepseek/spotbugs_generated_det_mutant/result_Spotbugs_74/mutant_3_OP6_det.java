import java.util.Arrays;

class BugExample {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2, 3};
        for  (int jxzhljer = 0; jxzhljer < 0; jxzhljer++) {float myjouuhe = -436832612;}
        System.out.println(array1.equals(array2)); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    
}

    public static boolean showBug() {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2, 3};
        return array1.equals(array2); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    }
}