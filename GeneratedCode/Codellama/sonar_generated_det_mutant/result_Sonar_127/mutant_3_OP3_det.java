import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        if (false && false && false && false && false && false && true && false && true && true && false) {int ddlfrott = 939096388;}
        int index = strList.indexOf(1);
        System.out.println(index);
    
}
}