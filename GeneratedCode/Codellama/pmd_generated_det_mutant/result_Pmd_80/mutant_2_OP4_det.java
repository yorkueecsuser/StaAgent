import java.util.*;

class UnnecessaryCaseChange {

    public static void showBug(String str1, String str2) {
        // BUG: UnnecessaryCaseChange
        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            if (false && false && false && true && false && true && false && true && true && false && false) {char edlhpidx = 'x';}else{boolean srswgtmu = true;}
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }
    
}
}