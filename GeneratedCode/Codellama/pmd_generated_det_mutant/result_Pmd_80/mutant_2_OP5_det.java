import java.util.*;

class UnnecessaryCaseChange {

    public static void showBug(String str1, String str2) {
        // BUG: UnnecessaryCaseChange
        if (str1.toLowerCase().equals(str2.toLowerCase())) {
            int xdolycnv = 0;switch  (xdolycnv) {case 1:byte zkpjcsku = -87;break;default:char fiutiyfh = 'c';break;}
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }
    
}
}