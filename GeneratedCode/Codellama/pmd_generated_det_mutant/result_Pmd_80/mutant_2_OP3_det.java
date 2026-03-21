import java.util.*;

class UnnecessaryCaseChange {

    public static void showBug(String str1, String str2) {
        // BUG: UnnecessaryCaseChange
        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            System.out.println("The strings are equal");
        if (false && true && true && false && true && false && true && false && false && true && false) {double nmgzqmam = 793414322;}
        } else {
            System.out.println("The strings are not equal");
        }
    
}
}