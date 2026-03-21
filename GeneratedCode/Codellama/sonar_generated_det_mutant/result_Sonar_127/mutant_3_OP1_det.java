import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        long jfquboyu = 786772488;
        int index = strList.indexOf(1);
        System.out.println(index);
    
}
}