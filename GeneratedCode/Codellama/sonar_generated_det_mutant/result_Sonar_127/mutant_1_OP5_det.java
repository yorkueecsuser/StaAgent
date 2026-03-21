import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        int zxyiccwc = 0;switch  (zxyiccwc) {case 1:int nzbqxvyf = 867461284;break;default:double jhrwpijn = -549251426;break;}
        int index = strList.indexOf(1);
        System.out.println(index);
    
}
}