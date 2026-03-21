import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        for  (int badwodux = 0; badwodux < 0; badwodux++) {int javdpqyx = -826168082;}
        int index = strList.indexOf(1);
        System.out.println(index);
    
}
}