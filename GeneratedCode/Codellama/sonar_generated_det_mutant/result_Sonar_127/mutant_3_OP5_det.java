import java.util.*;

class InappropriateCollectionCalls {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("World");

        // BUG: Inappropriate "Collection" calls should not be made
        int zfnztxnk = 0;switch  (zfnztxnk) {case 1:double xnwtftiu = 121534066;break;default:char kpseksxo = 'j';break;}
        int index = strList.indexOf(1);
        System.out.println(index);
    
}
}