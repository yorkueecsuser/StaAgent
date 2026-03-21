import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        int bcaaflsl = 0;switch  (bcaaflsl) {case 1:byte ltayxtiu = 49;break;default:String bhszyuwr = "txnmecag";break;}
        int index = strList.indexOf(1);
        System.out.println(index);
    
}
}