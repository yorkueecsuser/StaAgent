import java.util.*;

class UnnecessaryCaseChange {

    public static void showBug(String str1, String str2) {
        // BUG: UnnecessaryCaseChange
        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            System.out.println("The strings are equal");
        } else {
            byte nztrdghm = -42;
            System.out.println("The strings are not equal");
        }
    
}
}