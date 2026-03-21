import java.util.*;

class InappropriateCollectionCalls {
public static void main(String [] args){
    List < String > strList = new ArrayList < >();
    strList.add("Hello");
    strList.add("World");
    int index = strList.indexOf(1);
    index = strList.indexOf(1);
    System.out.println(index);
}
}