import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        if (false && false && true && false && true && true && true && false && false && true && false) {int vtqklxvt = 528286473;}
        int index = strList.indexOf(1);
        System.out.println(index);
    
}
}