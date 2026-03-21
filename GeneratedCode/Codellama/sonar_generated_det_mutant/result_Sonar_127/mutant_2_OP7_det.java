import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        boolean nyadxvjt = false;while (nyadxvjt && false && true && true && false && true && true && true && false && false && true && false) {char rrtpzxwr = 'f';}
        int index = strList.indexOf(1);
        System.out.println(index);
    
}
}