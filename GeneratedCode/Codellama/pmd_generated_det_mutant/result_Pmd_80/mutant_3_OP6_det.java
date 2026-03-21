import java.util.*;

class UnnecessaryCaseChange {

    public static void showBug(String str1, String str2) {
        for  (int aibtbjxu = 0; aibtbjxu < 0; aibtbjxu++) {int etlemzwi = -113759592;}
        // BUG: UnnecessaryCaseChange
        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }
    
}
}