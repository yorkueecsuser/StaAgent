import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        if (true && true && true && false && true && true && true && true && false && false && false) {float rrhmtrvh = -403368877;}else{boolean wobjyttm = false;}
        int index = strList.indexOf(1);
        System.out.println(index);
    
}
}