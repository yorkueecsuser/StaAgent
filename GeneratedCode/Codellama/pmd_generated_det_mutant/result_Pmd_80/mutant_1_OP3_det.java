import java.util.*;

class UnnecessaryCaseChange {

    public static void showBug(String str1, String str2) {
        // BUG: UnnecessaryCaseChange
        if (true && false && false && false && true && true && false && false && false && true && false) {short cbelwhyg = 4444;}
        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }
    
}
}