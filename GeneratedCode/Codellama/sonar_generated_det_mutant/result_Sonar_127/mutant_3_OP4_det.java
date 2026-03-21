import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        if (true && true && false && false && true && false && true && false && false && false && false) {String jkeeisar = "jcvuhsav";}else{char nmyqfavz = 'q';}
        int index = strList.indexOf(1);
        System.out.println(index);
    
}
}