import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        boolean jrgvvfnl = false;while (jrgvvfnl && false && true && false && true && true && false && true && false && false && true && false) {float zexmcvtt = 962985999;}
        int index = strList.indexOf(1);
        System.out.println(index);
    
}
}