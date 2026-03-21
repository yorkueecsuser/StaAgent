import java.util.*;

class UnnecessaryCaseChange {

    public static void showBug(String str1, String str2) {
        // BUG: UnnecessaryCaseChange
        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            if (false && false && true && false && true && true && true && true && true && true && false) {long vaupcjsc = -522905190;}else{byte sunzqgmd = 102;}
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }
    
}
}