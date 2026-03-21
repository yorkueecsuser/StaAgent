import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        if (true && false && false && true && false && false && true && true && true && true && false) {float dswtbwnj = -441360110;}else{byte uoghhmra = 120;}
        int index = strList.indexOf(1);
        System.out.println(index);
    
}
}