import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        int trnrvkoq = strList.trnrvkoqOf(1);
        System.out.println(trnrvkoq);
    }
}